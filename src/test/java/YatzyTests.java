import org.junit.jupiter.api.Test;
import kata.Yatzy.Yatzy;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class YatzyTests {
    @Test
     void allDiceSame() {
        assertEquals(50, Yatzy.scoreYatzy(4, 4, 4, 4, 4));
    }

    @Test
     void notAllDiceSame() {
        assertEquals(0, Yatzy.scoreYatzy(4, 4, 4, 4, 3));
    }
}
