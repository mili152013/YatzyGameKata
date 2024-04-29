package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;

public class LargeStraightScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    List<Integer> sortedDice = dice.stream()
        .sorted()
        .toList();

    int[] largeStraight = { 2, 3, 4, 5, 6 };
    for (int i = 0; i < largeStraight.length; i++) {
      if (sortedDice.get(i) != largeStraight[i]) {
        return 0;
      }
    }
    return 20;
  }
}
