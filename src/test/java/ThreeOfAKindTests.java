import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeOfAKindTests {

  static Stream<Object[]> scoreThreeOfKindProvider() {
    return Stream.of(
        new Object[] { List.of(3, 3, 3, 4, 5), 9 },
        new Object[] { List.of(3, 3, 4, 5, 6), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreThreeOfKindProvider")
  void scoreThreeOfKind(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreThreeOfKind(dice));
  }
}
