import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCategoryTests {

  static Stream<Object[]> scoreOnesProvider() {
    return Stream.of(
        new Object[] { List.of(1, 1, 2, 3, 4), 2 },
        new Object[] { List.of(2, 2, 2, 2, 2), 0 }
    );
  }

  static Stream<Object[]> scoreTwosProvider() {
    return Stream.of(
        new Object[] { List.of(1, 2, 3, 2, 4), 4 },
        new Object[] { List.of(1, 1, 1, 1, 1), 0 }
    );
  }

  static Stream<Object[]> scoreThreesProvider() {
    return Stream.of(
        new Object[] { List.of(3, 3, 3, 4, 5), 9 },
        new Object[] { List.of(2, 2, 2, 2, 2), 0 }
    );
  }

  static Stream<Object[]> scoreFoursProvider() {
    return Stream.of(
        new Object[] { List.of(4, 4, 2, 3, 1), 8 },
        new Object[] { List.of(2, 2, 2, 2, 2), 0 }
    );
  }

  static Stream<Object[]> scoreFivesProvider() {
    return Stream.of(
        new Object[] { List.of(5, 5, 5, 2, 3), 15 },
        new Object[] { List.of(1, 1, 1, 1, 1), 0 }
    );
  }

  static Stream<Object[]> scoreSixesProvider() {
    return Stream.of(
        new Object[] { List.of(6, 2, 6, 4, 5), 12 },
        new Object[] { List.of(1, 1, 1, 1, 1), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreOnesProvider")
  void scoreOnes(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreOnes(dice));
  }

  @ParameterizedTest
  @MethodSource("scoreTwosProvider")
  void scoreTwos(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreTwos(dice));
  }

  @ParameterizedTest
  @MethodSource("scoreThreesProvider")
  void scoreThrees(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreThrees(dice));
  }

  @ParameterizedTest
  @MethodSource("scoreFoursProvider")
  void scoreFours(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreFours(dice));
  }

  @ParameterizedTest
  @MethodSource("scoreFivesProvider")
  void scoreFives(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreFives(dice));
  }

  @ParameterizedTest
  @MethodSource("scoreSixesProvider")
  void scoreSixes(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreSixes(dice));
  }
}
