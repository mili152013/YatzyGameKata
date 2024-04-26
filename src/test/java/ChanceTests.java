import org.junit.jupiter.api.Test;
import kata.Yatzy.Yatzy;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class ChanceTests {
    @Test
     void scoreSumOfAllDice() {
        assertEquals(15, Yatzy.scoreChance(2, 3, 4, 1, 5));
        assertEquals(5, Yatzy.scoreChance(1, 1, 1, 1, 1));
    }
}
