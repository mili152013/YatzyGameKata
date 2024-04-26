import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeOfAKindTests {
  @Test
  void scoreThreeOfAKind() {
    assertEquals(9, Yatzy.scoreThreeOfKind(3, 3, 3, 4, 5));
    assertEquals(0, Yatzy.scoreThreeOfKind(3, 3, 4, 5, 6));
  }
}
