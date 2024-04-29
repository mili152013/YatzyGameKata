package kata.Yatzy;

import java.util.List;

public interface ScoreStrategy {
  int calculateScore(List<Integer> dice) throws IllegalArgumentException;

  default void validateDice(List<Integer> dice) throws IllegalArgumentException {
    dice.forEach(die -> {
      if (die < 1 || die > 6) {
        throw new IllegalArgumentException("Dice value must be between 1 and 6.");
      }
    });
  }
}
