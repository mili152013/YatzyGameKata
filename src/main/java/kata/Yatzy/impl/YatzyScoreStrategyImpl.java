package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

import java.util.List;

public class YatzyScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(List<Integer> dice) {
    this.validateDice(dice);
    boolean allSame = dice.stream()
        .allMatch(die -> die.equals(dice.getFirst()));

    return allSame ? 50 : 0;
  }
}
