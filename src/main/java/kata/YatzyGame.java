package kata;

import kata.Yatzy.ScoreStrategy;
import kata.Yatzy.ScoreStrategyFactory;
import kata.Yatzy.enumerations.ScoreCategory;

import java.util.Scanner;

public class YatzyGame {
  private final ScoreStrategyFactory factory;

  public YatzyGame() {
    this.factory = new ScoreStrategyFactory();
  }

  public static void main(String[] args) {
    new YatzyGame().playGame();
  }

  public void playGame() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Welcome to Yatzy! Choose a category to score:");

      for (ScoreCategory category : ScoreCategory.values()) {
        System.out.println(category.name() + " - " + category.getDisplayName());
      }

      System.out.print("Enter your choice (or 'quit' to exit): ");
      String choice = scanner.nextLine();

      if (choice.equalsIgnoreCase("quit")) {
        break;
      }

      ScoreCategory selectedCategory = getCategory(choice);
      if (selectedCategory == null) {
        System.out.println("Invalid category. Please choose a valid category.");
        continue;
      }

      int[] dice = new int[5];
      for (int i = 0; i < 5; i++) {
        dice[i] = getValidDiceValue(scanner, i + 1);
      }

      ScoreStrategy strategy = factory.getScoreStrategy(selectedCategory);
      int score = strategy.calculateScore(dice);

      System.out.println("Score for category '" + selectedCategory.getDisplayName() + "': " + score);
      System.out.println();
    }

    scanner.close();
  }

  private int getValidDiceValue(Scanner scanner, int index) {
    while (true) {
      System.out.print("Enter value for dice " + index + " (between 1 and 6): ");
      int value = scanner.nextInt();
      if (value >= 1 && value <= 6) {
        return value;
      }
      else {
        System.out.println("Invalid value. Please enter a value between 1 and 6.");
      }
    }
  }

  private ScoreCategory getCategory(String input) {
    for (ScoreCategory category : ScoreCategory.values()) {
      if (category.name().equalsIgnoreCase(input)) {
        return category;
      }
    }
    return null;
  }
}
