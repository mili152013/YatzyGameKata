import org.junit.jupiter.api.Test;
import kata.Yatzy.Yatzy;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class TwoPairsTests {
    @Test
     void scoreTwoPairs() {
        assertEquals(14, Yatzy.scoreTwos(1, 1, 2, 3, 3));
        assertEquals(0, Yatzy.scoreTwos(1, 1, 2, 3, 4));
    }
}
