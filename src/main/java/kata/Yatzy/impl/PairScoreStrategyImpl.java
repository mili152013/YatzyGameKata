package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.Arrays;

public class PairScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    Arrays.sort(dice);
    for (int i = dice.length - 1; i > 0; i--) {
      if (dice[i] == dice[i - 1]) {
        return dice[i] * 2;
      }
    }
    return 0;
  }
}
