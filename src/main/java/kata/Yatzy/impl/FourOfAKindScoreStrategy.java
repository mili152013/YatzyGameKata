package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

public class FourOfAKindScoreStrategy implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    int[] counts = new int[7];
    for (int die : dice) {
      counts[die]++;
    }

    for (int i = 1; i < counts.length; i++) {
      if (counts[i] >= 4) {
        return i * 4;
      }
    }
    return 0;
  }
}
