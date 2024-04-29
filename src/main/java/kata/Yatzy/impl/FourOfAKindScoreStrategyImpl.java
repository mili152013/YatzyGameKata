package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FourOfAKindScoreStrategyImpl implements ScoreStrategy {

  @Override
  public int calculateScore(List<Integer> dice) {
    validateDice(dice);

    Map<Integer, Long> frequencyMap = dice.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    return frequencyMap.entrySet().stream()
        .filter(entry -> entry.getValue() >= 4)
        .mapToInt(entry -> entry.getKey() * 4)
        .findFirst()
        .orElse(0);
  }
}
