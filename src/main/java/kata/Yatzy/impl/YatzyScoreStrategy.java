package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

public class YatzyScoreStrategy implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    int firstDie = dice[0];
    for (int die : dice) {
      if (die != firstDie) {
        return 0;
      }
    }
    return 50;
  }
}
