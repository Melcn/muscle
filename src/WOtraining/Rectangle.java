package WOtraining;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void widen() {
        this.width = this.width + 1;
    }
}