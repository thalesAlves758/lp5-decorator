public class BaseGame implements Game {
    private float value;

    public BaseGame(float value) {
        this.value = value;
    }

    public float getGameValue() {
        return this.value;
    }
}
