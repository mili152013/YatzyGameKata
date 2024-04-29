package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThreeOfAKindScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    Map<Integer, Long> frequencyMap = dice.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    return frequencyMap.entrySet().stream()
        .filter(entry -> entry.getValue() >= 3)
        .mapToInt(entry -> entry.getKey() * 3)
        .findFirst()
        .orElse(0);
  }
}
