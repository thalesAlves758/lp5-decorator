public class SeasonPass extends GameDecorator {
    public SeasonPass(Game game) {
        super(game);
    }

    public float getValue() {
        return 60f;
    }
}
