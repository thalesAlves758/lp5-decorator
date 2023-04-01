import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    void shouldReturnBaseGameValue() {
        Game game = new BaseGame(300f);

        assertEquals(300f, game.getGameValue());
    }

    @Test
    void shouldReturnBaseGameWithSeasonPassValue() {
        Game game = new SeasonPass(new BaseGame(300f));

        assertEquals(360f, game.getGameValue());
    }

    @Test
    void shouldReturnBaseGameWithSummerDLCValue() {
        Game game = new SummerDLC(new BaseGame(300f));

        assertEquals(459f, game.getGameValue());
    }

    @Test
    void shouldReturnBaseGameWithWinterDLCValue() {
        Game game = new WinterDLC(new BaseGame(300f));

        assertEquals(409f, game.getGameValue());
    }

    @Test
    void shouldReturnBaseGameWithSeasonPassPlusSummerDLCValue() {
        Game game = new SeasonPass(new SummerDLC(new BaseGame(300f)));

        assertEquals(519f, game.getGameValue());
    }
}
