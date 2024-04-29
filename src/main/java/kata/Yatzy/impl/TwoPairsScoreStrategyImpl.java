package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoPairsScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    Map<Integer, Long> frequencyMap = dice.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    List<Integer> scores = frequencyMap.entrySet().stream()
        .filter(entry -> entry.getValue() >= 2)
        .map(entry -> entry.getKey() * 2)
        .sorted(Comparator.reverseOrder())
        .toList();

    if (scores.size() >= 2) {
      return scores.get(0) + scores.get(1);
    }
    return 0;
  }
}
