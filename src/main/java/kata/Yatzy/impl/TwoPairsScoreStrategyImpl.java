package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.Arrays;

public class TwoPairsScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    Arrays.sort(dice);
    int score = 0;
    int pairCount = 0;

    for (int i = dice.length - 1; i > 0; i--) {
      if (dice[i] == dice[i - 1]) {
        score += dice[i] * 2;
        pairCount++;
        i--;

        if (pairCount == 2) {
          return score;
        }
      }
    }
    return 0;
  }
}
