package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

public class ChanceScoreStrategy implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    int score = 0;
    for (int die : dice) {
      score += die;
    }
    return score;
  }
}
