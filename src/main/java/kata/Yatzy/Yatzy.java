package kata.Yatzy;

import kata.Yatzy.enumerations.ScoreCategory;

import java.util.List;

public class Yatzy {

  private static final ScoreStrategyFactory scoreStrategyFactory = new ScoreStrategyFactory();

  public static int scoreOnes(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.ONES).calculateScore(dice);
  }

  public static int scoreTwos(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.TWOS).calculateScore(dice);
  }

  public static int scoreThrees(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.THREES).calculateScore(dice);
  }

  public static int scoreFours(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.FOURS).calculateScore(dice);
  }

  public static int scoreFives(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.FIVES).calculateScore(dice);
  }

  public static int scoreSixes(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.SIXES).calculateScore(dice);
  }

  public static int scorePair(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.PAIR).calculateScore(dice);
  }

  public static int scoreFullHouse(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.FULL_HOUSE).calculateScore(dice);
  }

  public static int scoreSmallStraight(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.SMALL_STRAIGHT).calculateScore(dice);
  }

  public static int scoreLargeStraight(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.LARGE_STRAIGHT).calculateScore(dice);
  }

  public static int scoreChance(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.CHANCE).calculateScore(dice);
  }

  public static int scoreYatzy(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.YATZY).calculateScore(dice);
  }

  public static int scoreTwoPairs(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.TWO_PAIRS).calculateScore(dice);
  }

  public static int scoreThreeOfKind(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.THREE_OF_A_KIND).calculateScore(dice);
  }

  public static int scoreFourOfKind(List<Integer> dice) {
    return scoreStrategyFactory.getScoreStrategy(ScoreCategory.FOUR_OF_A_KIND).calculateScore(dice);
  }

}
