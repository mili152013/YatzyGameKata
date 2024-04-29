import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPairsTests {

  static Stream<Object[]> scoreTwoPairsProvider() {
    return Stream.of(
        new Object[] { List.of(1, 1, 2, 3, 3), 8 },
        new Object[] { List.of(1, 1, 2, 3, 4), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreTwoPairsProvider")
  void scoreTwoPairs(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreTwoPairs(dice));
  }
}
