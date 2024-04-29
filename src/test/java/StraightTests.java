import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StraightTests {

  static Stream<Object[]> scoreSmallStraightProvider() {
    return Stream.of(
        new Object[] { List.of(1, 2, 3, 4, 5), 15 },
        new Object[] { List.of(1, 2, 2, 4, 5), 0 }
    );
  }

  static Stream<Object[]> scoreLargeStraightProvider() {
    return Stream.of(
        new Object[] { List.of(2, 3, 4, 5, 6), 20 },
        new Object[] { List.of(1, 2, 3, 4, 5), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreSmallStraightProvider")
  void scoreSmallStraight(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreSmallStraight(dice));
  }

  @ParameterizedTest
  @MethodSource("scoreLargeStraightProvider")
  void scoreLargeStraight(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreLargeStraight(dice));
  }
}
