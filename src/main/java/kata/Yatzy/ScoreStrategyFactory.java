package kata.Yatzy;

import kata.Yatzy.enumerations.ScoreCategory;
import kata.Yatzy.impl.ChanceScoreStrategyImpl;
import kata.Yatzy.impl.FourOfAKindScoreStrategyImpl;
import kata.Yatzy.impl.FullHouseScoreStrategyImpl;
import kata.Yatzy.impl.LargeStraightScoreStrategyImpl;
import kata.Yatzy.impl.NumberScoreStrategyImpl;
import kata.Yatzy.impl.PairScoreStrategyImpl;
import kata.Yatzy.impl.SmallStraightScoreStrategyImpl;
import kata.Yatzy.impl.ThreeOfAKindScoreStrategyImpl;
import kata.Yatzy.impl.TwoPairsScoreStrategyImpl;
import kata.Yatzy.impl.YatzyScoreStrategyImpl;

public class ScoreStrategyFactory {
  public ScoreStrategy getScoreStrategy(ScoreCategory category) {
    return switch (category) {
      case ONES -> new NumberScoreStrategyImpl(1);
      case TWOS -> new NumberScoreStrategyImpl(2);
      case THREES -> new NumberScoreStrategyImpl(3);
      case FOURS -> new NumberScoreStrategyImpl(4);
      case FIVES -> new NumberScoreStrategyImpl(5);
      case SIXES -> new NumberScoreStrategyImpl(6);
      case THREE_OF_A_KIND -> new ThreeOfAKindScoreStrategyImpl();
      case FOUR_OF_A_KIND -> new FourOfAKindScoreStrategyImpl();
      case PAIR -> new PairScoreStrategyImpl();
      case TWO_PAIRS -> new TwoPairsScoreStrategyImpl();
      case SMALL_STRAIGHT -> new SmallStraightScoreStrategyImpl();
      case LARGE_STRAIGHT -> new LargeStraightScoreStrategyImpl();
      case FULL_HOUSE -> new FullHouseScoreStrategyImpl();
      case CHANCE -> new ChanceScoreStrategyImpl();
      case YATZY -> new YatzyScoreStrategyImpl();
      default -> throw new IllegalArgumentException("Unknown scoring category: " + category);
    };
  }
}
