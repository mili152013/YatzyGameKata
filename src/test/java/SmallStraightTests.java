import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SmallStraightTests {
    @Test
     void scoreSmallStraightWithPerfectStraight() {
        assertEquals(15, Yatzy.scoreSmallStraight(1, 2, 3, 4, 5));
    }

    @Test
     void scoreSmallStraightWithMixedNumbersNotAStraight() {
        assertEquals(0, Yatzy.scoreSmallStraight(1, 2, 2, 4, 5));
    }

    @Test
     void scoreSmallStraightWithUnsortedNumbersStillAStraight() {
        assertEquals(15, Yatzy.scoreSmallStraight(3, 5, 4, 1, 2));
    }

    @Test
     void scoreSmallStraightWithAdditionalNumbers() {
        assertEquals(0, Yatzy.scoreSmallStraight(6, 2, 3, 4, 5));
    }
}
