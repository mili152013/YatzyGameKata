package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FullHouseScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    Map<Integer, Long> frequencyMap = dice.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    int score = 0;
    boolean hasThreeOfAKind = false;
    boolean hasPair = false;

    for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
      int face = entry.getKey();
      long count = entry.getValue();
      if (count == 3) {
        hasThreeOfAKind = true;
        score += face * 3;
      }
      else if (count == 2) {
        hasPair = true;
        score += face * 2;
      }
    }

    return (hasThreeOfAKind && hasPair) ? score : 0;
  }
}
