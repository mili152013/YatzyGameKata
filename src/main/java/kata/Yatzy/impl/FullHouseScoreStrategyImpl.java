package kata.Yatzy.impl;

import kata.Yatzy.ScoreStrategy;

public class FullHouseScoreStrategyImpl implements ScoreStrategy {
  @Override
  public int calculateScore(int... dice) {
    this.validateDice(dice);
    int[] counts = new int[7];
    for (int die : dice) {
      counts[die]++;
    }

    boolean hasThreeOfAKind = false;
    boolean hasPair = false;
    int score = 0;

    for (int i = 1; i < counts.length; i++) {
      if (counts[i] == 3) {
        hasThreeOfAKind = true;
        score += i * 3;
      }
      else if (counts[i] == 2) {
        hasPair = true;
        score += i * 2;
      }
    }

    if (hasThreeOfAKind && hasPair) {
      return score;
    }
    return 0;
  }
}
