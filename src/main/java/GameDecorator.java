public abstract class GameDecorator implements Game {
    private Game game;

    public GameDecorator(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public abstract float getValue();

    @Override
    public float getGameValue() {
        return this.game.getGameValue() + this.getValue();
    }
}
