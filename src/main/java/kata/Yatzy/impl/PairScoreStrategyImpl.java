package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PairScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    return dice.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream()
        .filter(entry -> entry.getValue() >= 2)
        .map(entry -> entry.getKey() * 2)
        .max(Comparator.naturalOrder())
        .orElse(0);
  }
}
