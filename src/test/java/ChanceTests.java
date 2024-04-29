import kata.Yatzy.Yatzy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTests {

  private static Stream<Object[]> diceProvider() {
    return Stream.generate(() -> {
      List<Integer> dice = generateRandomDice();
      int expectedScore = calculateExpectedScore(dice);
      return new Object[] { dice, expectedScore };
    }).limit(10);
  }

  private static List<Integer> generateRandomDice() {
    return IntStream.range(0, 5)
        .mapToObj(i -> (int)(Math.random() * 6) + 1)
        .collect(Collectors.toList());
  }

  private static int calculateExpectedScore(List<Integer> dice) {
    return dice.stream().mapToInt(Integer::intValue).sum();
  }

  @ParameterizedTest
  @MethodSource("diceProvider")
  void scoreSumOfAllDice(List<Integer> dice, int expectedScore) {
    assertEquals(expectedScore, Yatzy.scoreChance(dice));
  }
}
