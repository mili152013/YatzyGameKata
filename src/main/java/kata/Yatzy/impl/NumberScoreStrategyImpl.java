package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

public class NumberScoreStrategyImpl implements ScoreStrategy {
  private final int number;

  public NumberScoreStrategyImpl(int number) {
    this.number = number;
  }

  @Override
  public int calculateScore(int... dice) {
    for (int die : dice) {
      if (die < 1 || die > 6) {
        throw new IllegalArgumentException("Dice value must be between 1 and 6");
      }
    }
    int sum = 0;
    for (int die : dice) {
      if (die == number) {
        sum += die;
      }
    }
    return sum;
  }
}
