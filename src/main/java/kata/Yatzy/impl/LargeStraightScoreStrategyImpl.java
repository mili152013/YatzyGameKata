package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.Arrays;

public class LargeStraightScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    Arrays.sort(dice);
    for (int i = 0; i < dice.length; i++) {
      if (dice[i] != i + 2) {
        return 0;
      }
    }
    return 20;
  }
}
