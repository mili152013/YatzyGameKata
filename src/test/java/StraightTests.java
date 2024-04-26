import org.junit.jupiter.api.Test;
import kata.Yatzy.Yatzy;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class StraightTests {
    @Test
     void scoreSmallStraight() {
        assertEquals(15, Yatzy.scoreSmallStraight(1, 2, 3, 4, 5));
        assertEquals(0, Yatzy.scoreSmallStraight(1, 2, 2, 4, 5));
    }

    @Test
     void scoreLargeStraight() {
        assertEquals(20, Yatzy.scoreLargeStraight(2, 3, 4, 5, 6));
        assertEquals(0, Yatzy.scoreLargeStraight(1, 2, 3, 4, 5));
    }
}
