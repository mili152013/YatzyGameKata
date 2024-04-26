import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import kata.Yatzy.Yatzy;
 class FourOfAKindTests {
    @Test
     void scoreFourOfAKind() {
        assertEquals(8, Yatzy.scoreFours(2, 2, 2, 2, 5));
        assertEquals(0, Yatzy.scoreFours(2, 2, 2, 5, 5));
    }
}
