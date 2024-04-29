import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourOfAKindTests {

  static Stream<Object[]> scoreFourOfKindProvider() {
    return Stream.of(
        new Object[] { List.of(2, 2, 2, 2, 5), 8 },
        new Object[] { List.of(2, 2, 2, 5, 5), 0 }
    );
  }

  @ParameterizedTest
  @MethodSource("scoreFourOfKindProvider")
  void scoreFourOfKind(List<Integer> dice, int expected) {
    assertEquals(expected, Yatzy.scoreFourOfKind(dice));
  }
}
