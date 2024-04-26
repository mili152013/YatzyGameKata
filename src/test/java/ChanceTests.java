import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTests {
  @Test
  void scoreSumOfAllDice() {
    for (int i = 0; i < 10; i++) {
      int[] dice = generateRandomDice();
      int expectedScore = calculateExpectedScore(dice);
      assertEquals(expectedScore, Yatzy.scoreChance(dice));
    }
  }

  private int[] generateRandomDice() {
    int[] dice = new int[5];
    for (int i = 0; i < 5; i++) {
      dice[i] = (int)(Math.random() * 6) + 1;
    }
    return dice;
  }

  private int calculateExpectedScore(int[] dice) {
    int sum = 0;
    for (int die : dice) {
      sum += die;
    }
    return sum;
  }
}
