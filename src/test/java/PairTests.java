import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTests {
    @Test
     void findHighestPair() {
        assertEquals(12, Yatzy.scorePair(5, 3, 3, 5, 6));
        assertEquals(0, Yatzy.scorePair(1, 2, 3, 4, 5));
    }

    @Test
     void findSinglePairWhenMultiplePairsExist() {
        assertEquals(10, Yatzy.scorePair(5, 3, 5, 3, 5));
    }
}
