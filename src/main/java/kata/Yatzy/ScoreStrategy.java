package kata.Yatzy;

public interface ScoreStrategy {
  int calculateScore(int... dice) throws IllegalArgumentException;

  default void validateDice(int... dice) throws IllegalArgumentException {
    for (int die : dice) {
      if (die < 1 || die > 6) {
        throw new IllegalArgumentException("Dice value must be between 1 and 6");
      }
    }
  }
}
