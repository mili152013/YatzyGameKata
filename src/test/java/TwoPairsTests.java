import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPairsTests {
  @Test
  void scoreTwoPairs() {
    assertEquals(8, Yatzy.scoreTwoPairs(1, 1, 2, 3, 3));
    assertEquals(0, Yatzy.scoreTwoPairs(1, 1, 2, 3, 4));
  }
}
