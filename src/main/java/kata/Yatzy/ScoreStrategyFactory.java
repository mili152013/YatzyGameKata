package kata.Yatzy;

import kata.Yatzy.enumerations.ScoreCategory;
import kata.Yatzy.impl.ChanceScoreStrategy;
import kata.Yatzy.impl.FourOfAKindScoreStrategy;
import kata.Yatzy.impl.FullHouseScoreStrategy;
import kata.Yatzy.impl.LargeStraightScoreStrategy;
import kata.Yatzy.impl.PairScoreStrategy;
import kata.Yatzy.impl.SmallStraightScoreStrategy;
import kata.Yatzy.impl.ThreeOfAKindScoreStrategy;
import kata.Yatzy.impl.TwoPairsScoreStrategy;
import kata.Yatzy.impl.YatzyScoreStrategy;

public class ScoreStrategyFactory {
  public ScoreStrategy getScoreStrategy(ScoreCategory category) {
    return switch (category) {
      case THREE_OF_A_KIND -> new ThreeOfAKindScoreStrategy();
      case FOUR_OF_A_KIND -> new FourOfAKindScoreStrategy();
      case PAIR -> new PairScoreStrategy();
      case TWO_PAIRS -> new TwoPairsScoreStrategy();
      case SMALL_STRAIGHT -> new SmallStraightScoreStrategy();
      case LARGE_STRAIGHT -> new LargeStraightScoreStrategy();
      case FULL_HOUSE -> new FullHouseScoreStrategy();
      case CHANCE -> new ChanceScoreStrategy();
      case YATZY -> new YatzyScoreStrategy();
      default -> throw new IllegalArgumentException("Unknown scoring category: " + category);
    };
  }
}
