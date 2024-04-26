package kata.Yatzy;

public class Yatzy {

    // Méthode pour calculer le score pour "Ones"
    public static int scoreOnes(int... dice) {
        return scoreSingleNumber(1, dice);
    }

    // Méthode pour calculer le score pour "Twos"
    public static int scoreTwos(int... dice) {
        return scoreSingleNumber(2, dice);
    }

    // Méthode pour calculer le score pour "Threes"
    public static int scoreThrees(int... dice) {
        return scoreSingleNumber(3, dice);
    }

    // Méthode pour calculer le score pour "Fours"
    public static int scoreFours(int... dice) {
        return scoreSingleNumber(4, dice);
    }

    // Méthode pour calculer le score pour "Fives"
    public static int scoreFives(int... dice) {
        return scoreSingleNumber(5, dice);
    }

    // Méthode pour calculer le score pour "Sixes"
    public static int scoreSixes(int... dice) {
        return scoreSingleNumber(6, dice);
    }

    // Méthode générique pour calculer le score basé sur le nombre choisi
    private static int scoreSingleNumber(int number, int[] dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == number) {
                sum += die;
            }
        }
        return sum;
    }

    // Méthode pour calculer le score pour "Pair"
    public static int scorePair(int... dice) {
        // Logique pour calculer le plus haut "Pair"
      return 0;
    }

    public static int scoreFullHouse(int i, int i1, int i2, int i3, int i4) {
        // Logique pour calculer le full house"
      return 0;
    }

    public static int scoreSmallStraight(int i, int i1, int i2, int i3, int i4) {
        // Logique pour calculer le SmallStraight"
        return 0;
    }

    public static int scoreLargeStraight(int i, int i1, int i2, int i3, int i4) {
        // Logique pour calculer le LargeStraight"
        return 0;
    }

    public static int scoreChance(int i, int i1, int i2, int i3, int i4) {
        // Logique pour calculer le chance score"
        return 0;
    }

    public static int scoreYatzy(int i, int i1, int i2, int i3, int i4) {
        // Logique pour calculer le chance score"
        return 0;
    }
}
