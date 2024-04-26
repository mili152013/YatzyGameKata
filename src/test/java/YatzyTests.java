import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class YatzyTests {
  @Test
  void allDiceSame() {
    for (int i = 1; i <= 6; i++) {
      assertEquals(50, Yatzy.scoreYatzy(i, i, i, i, i));
    }
  }

  @Test
  void notAllDiceSame() {
    for (int i = 1; i <= 5; i++) {
      assertEquals(0, Yatzy.scoreYatzy(i, i, i, i, 6));
    }
  }

  @Test
  void throwsExceptionForInvalidDiceValues() {
    assertThrows(IllegalArgumentException.class, () -> {
      Yatzy.scoreYatzy(0, 7, 8, -1, 10);
    });
  }

  @Test
  void scoreZeroWhenNoApplicableDice() {
    assertEquals(0, Yatzy.scoreYatzy(1, 2, 3, 4, 5));
  }

}
