package kata.Yatzy.enumerations;

public enum ScoreCategory {
  ONES("Ones"),
  TWOS("Twos"),
  THREES("Threes"),
  FOURS("Fours"),
  FIVES("Fives"),
  SIXES("Sixes"),
  THREE_OF_A_KIND("Three of a Kind"),
  FOUR_OF_A_KIND("Four of a Kind"),
  PAIR("Pair"),
  TWO_PAIRS("Two Pairs"),
  SMALL_STRAIGHT("Small Straight"),
  LARGE_STRAIGHT("Large Straight"),
  FULL_HOUSE("Full House"),
  CHANCE("Chance"),
  YATZY("Yatzy");

  private final String displayName;

  ScoreCategory(String displayName) {
    this.displayName = displayName;
  }

  public String getDisplayName() {
    return displayName;
  }
}
