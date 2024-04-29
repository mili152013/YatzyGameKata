import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class YatzyTests {

  static Stream<Object[]> scoreYatzyProvider() {
    return Stream.of(
        new Object[] { List.of(1, 1, 1, 1, 1), 50 },
        new Object[] { List.of(2, 2, 2, 2, 2), 50 },
        new Object[] { List.of(3, 3, 3, 3, 3), 50 },
        new Object[] { List.of(4, 4, 4, 4, 4), 50 },
        new Object[] { List.of(5, 5, 5, 5, 5), 50 },
        new Object[] { List.of(6, 6, 6, 6, 6), 50 },
        new Object[] { List.of(1, 1, 1, 1, 6), 0 },
        new Object[] { List.of(2, 2, 2, 2, 5), 0 },
        new Object[] { List.of(3, 3, 3, 3, 4), 0 },
        new Object[] { List.of(4, 4, 4, 4, 3), 0 },
        new Object[] { List.of(5, 5, 5, 5, 2), 0 },
        new Object[] { List.of(1, 2, 3, 4, 5), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreYatzyProvider")
  void scoreYatzy(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreYatzy(dice));
  }

  @Test
  void throwsExceptionForInvalidDiceValues() {
    List<Integer> invalidDiceValues = List.of(0, 7, 8, -1, 10);
    assertThrows(IllegalArgumentException.class, () -> Yatzy.scoreYatzy(invalidDiceValues));
  }

}
