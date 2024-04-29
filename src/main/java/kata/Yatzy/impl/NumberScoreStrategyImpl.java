package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;

public class NumberScoreStrategyImpl implements ScoreStrategy {
  private final int number;

  public NumberScoreStrategyImpl(int number) {
    this.number = number;
  }

  @Override
  public int calculateScore(List<Integer> dice) {
    validateDice(dice);
    return dice.stream()
        .filter(die -> die == number)
        .mapToInt(Integer::intValue)
        .sum();
  }
}
