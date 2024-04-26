package kata.Yatzy;

import kata.Yatzy.enumerations.ScoreCategory;

public class Yatzy {

  private static final ScoreStrategyFactory scoreStrategyFactory = new ScoreStrategyFactory();

  public static int scoreOnes(int... dice) {
    return scoreSingleNumber(1, dice);
  }

  public static int scoreTwos(int... dice) {
    return scoreSingleNumber(2, dice);
  }

  public static int scoreThrees(int... dice) {
    return scoreSingleNumber(3, dice);
  }

  public static int scoreFours(int... dice) {
    return scoreSingleNumber(4, dice);
  }

  public static int scoreFives(int... dice) {
    return scoreSingleNumber(5, dice);
  }

  public static int scoreSixes(int... dice) {
    return scoreSingleNumber(6, dice);
  }

  public static int scorePair(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.PAIR).calculateScore(dice);
  }

  public static int scoreFullHouse(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.FULL_HOUSE).calculateScore(dice);
  }

  public static int scoreSmallStraight(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.SMALL_STRAIGHT).calculateScore(dice);
  }

  public static int scoreLargeStraight(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.LARGE_STRAIGHT).calculateScore(dice);
  }

  public static int scoreChance(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.CHANCE).calculateScore(dice);
  }

  public static int scoreYatzy(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.YATZY).calculateScore(dice);
  }

  public static int scoreTwoPairs(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.TWO_PAIRS).calculateScore(dice);
  }

  public static int scoreThreeOfKind(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.THREE_OF_A_KIND).calculateScore(dice);
  }

  public static int scoreFourOfKind(int... dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.FOUR_OF_A_KIND).calculateScore(dice);
  }

  private static int scoreSingleNumber(int number, int[] dice) {
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
