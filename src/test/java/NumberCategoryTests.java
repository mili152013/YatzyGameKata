import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class NumberCategoryTests {
    @Test
     void scoreOnes() {
        assertEquals(2, Yatzy.scoreOnes(1, 1, 2, 3, 4));
        assertEquals(0, Yatzy.scoreOnes(2, 2, 2, 2, 2));
    }

    @Test
     void scoreTwos() {
        assertEquals(4, Yatzy.scoreTwos(1, 2, 3, 2, 4));
        assertEquals(0, Yatzy.scoreTwos(1, 1, 1, 1, 1));
    }

    @Test
     void scoreThrees() {
        assertEquals(9, Yatzy.scoreThrees(3, 3, 3, 4, 5));
        assertEquals(0, Yatzy.scoreThrees(2, 2, 2, 2, 2));
    }

    @Test
     void scoreFours() {
        assertEquals(8, Yatzy.scoreFours(4, 4, 2, 3, 1));
        assertEquals(0, Yatzy.scoreFours(2, 2, 2, 2, 2));
    }

    @Test
     void scoreFives() {
        assertEquals(15, Yatzy.scoreFives(5, 5, 5, 2, 3));
        assertEquals(0, Yatzy.scoreFives(1, 1, 1, 1, 1));
    }

    @Test
     void scoreSixes() {
        assertEquals(12, Yatzy.scoreSixes(6, 2, 6, 4, 5));
        assertEquals(0, Yatzy.scoreSixes(1, 1, 1, 1, 1));
    }
}
