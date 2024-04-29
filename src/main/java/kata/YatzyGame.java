package kata;

import kata.Yatzy.ScoreStrategy;
import kata.Yatzy.ScoreStrategyFactory;
import kata.Yatzy.enumerations.ScoreCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YatzyGame {
  private final ScoreStrategyFactory factory;

  public YatzyGame() {
    this.factory = new ScoreStrategyFactory();
  }

  public static void main(String[] args) {
    new YatzyGame().playGame(args);
  }

  public void playGame(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Welcome to Yatzy! Choose a category to score:");

      for (ScoreCategory category : ScoreCategory.values()) {
        System.out.println(category.name() + " - " + category.getDisplayName());
      }

      System.out.print("Enter your choice (or 'quit' to exit): ");
      String choice = scanner.nextLine().trim();

      if (choice.equalsIgnoreCase("quit")) {
        System.out.println("Thank you for playing Yatzy!");
        break;
      }

      ScoreCategory selectedCategory = getCategory(choice);
      if (selectedCategory == null) {
        System.out.println("Invalid category. Please choose a valid category.");
        continue;
      }

      List<Integer> dice = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        dice.add(getValidDiceValue(scanner, i + 1));
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
      String input = scanner.nextLine().trim();
      try {
        int value = Integer.parseInt(input);
        if (value >= 1 && value <= 6) {
          return value;
        }
        else {
          System.out.println("Invalid value. Please enter a value between 1 and 6.");
        }
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a numerical value.");
      }
    }
  }

  private ScoreCategory getCategory(String input) {
    try {
      return ScoreCategory.valueOf(input.toUpperCase());
    }
    catch (IllegalArgumentException e) {
      return null;
    }
  }
}
