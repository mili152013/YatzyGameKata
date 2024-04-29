import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTests {

  static Stream<Object[]> scorePairProvider() {
    return Stream.of(
        new Object[] { List.of(5, 3, 3, 5, 6), 10 },
        new Object[] { List.of(3, 3, 3, 4, 4), 8 },
        new Object[] { List.of(1, 2, 3, 4, 5), 0 },
        new Object[] { List.of(5, 3, 5, 3, 5), 10 }
    );
  }

  @ParameterizedTest
  @MethodSource("scorePairProvider")
  void scorePair(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scorePair(dice));
  }
}
