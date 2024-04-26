import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class YatzyTests {
  @Test
  void allDiceSame() {
    assertEquals(50, Yatzy.scoreYatzy(4, 4, 4, 4, 4));
  }

  @Test
  void notAllDiceSame() {
    assertEquals(0, Yatzy.scoreYatzy(4, 4, 4, 4, 3));
  }

  @Test
  void throwsExceptionForInvalidDiceValues() {
    assertThrows(IllegalArgumentException.class, () -> {
      Yatzy.scorePair(0, 7, 8, -1, 10);
    });
  }

  @Test
  void scoreZeroWhenNoApplicableDice() {
    assertEquals(0, Yatzy.scoreTwos(1, 2, 3, 4, 5));
  }

}
