import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourOfAKindTests {
  @Test
  void scoreFourOfAKind() {
    assertEquals(8, Yatzy.scoreFourOfKind(2, 2, 2, 2, 5));
    assertEquals(0, Yatzy.scoreFourOfKind(2, 2, 2, 5, 5));
  }
}
