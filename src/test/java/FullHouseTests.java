import kata.Yatzy.Yatzy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FullHouseTests {
    @Test
     void scoreFullHouse() {
        assertEquals(18, Yatzy.scoreFullHouse(6, 2, 2, 6, 2));
        assertEquals(0, Yatzy.scoreFullHouse(2, 3, 4, 5, 6));
    }
}
