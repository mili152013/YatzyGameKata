package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.Arrays;

public class SmallStraightScoreStrategy implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    Arrays.sort(dice);
    for (int i = 0; i < dice.length - 1; i++) {
      if (dice[i] != i + 1) {
        return 0;
      }
    }
    return 15;
  }
}
