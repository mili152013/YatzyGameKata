import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeStraightTests {
    @Test
     void scoreLargeStraight_withPerfectStraight() {
        assertEquals(20, Yatzy.scoreLargeStraight(2, 3, 4, 5, 6));
    }

    @Test
     void scoreLargeStraight_withMixedNumbersNotAStraight() {
        assertEquals(0, Yatzy.scoreLargeStraight(1, 2, 3, 4, 5));
    }

    @Test
     void scoreLargeStraight_withUnsortedNumbersStillAStraight() {
        assertEquals(20, Yatzy.scoreLargeStraight(6, 5, 4, 3, 2));
    }

    @Test
     void scoreLargeStraight_withAdditionalNumbers() {
        assertEquals(0, Yatzy.scoreLargeStraight(1, 2, 3, 4, 6));
    }
}
