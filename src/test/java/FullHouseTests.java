import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullHouseTests {

  static Stream<Object[]> scoreFullHouseProvider() {
    return Stream.of(
        new Object[] { List.of(6, 2, 2, 6, 2), 18 },
        new Object[] { List.of(2, 3, 4, 5, 6), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreFullHouseProvider")
  void scoreFullHouse(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreFullHouse(dice));
  }
}
