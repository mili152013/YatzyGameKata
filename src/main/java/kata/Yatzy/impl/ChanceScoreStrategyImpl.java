package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;

public class ChanceScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    return dice.stream()
        .mapToInt(Integer::intValue)
        .sum();
  }
}
