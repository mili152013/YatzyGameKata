package kata;

import kata.Yatzy.ScoreStrategyFactory;

public class YatzyGame {
  private ScoreStrategyFactory factory;

  public YatzyGame() {
    this.factory = new ScoreStrategyFactory();
  }

  public void playGame() {
    // Logique du jeu
  }

  public static void main(String[] args) {
    new YatzyGame().playGame();
  }
}
