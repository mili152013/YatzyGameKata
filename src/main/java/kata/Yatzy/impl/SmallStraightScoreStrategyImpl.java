package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;

public class SmallStraightScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    List<Integer> sortedDice = dice.stream()
        .sorted()
        .toList();

    int[] smallStraight = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < smallStraight.length; i++) {
      if (sortedDice.get(i) != smallStraight[i]) {
        return 0;  // If any die does not match the small straight sequence, return 0
      }
    }
    return 15;  // If all dice match the sequence, return the score for a small straight
  }
}
