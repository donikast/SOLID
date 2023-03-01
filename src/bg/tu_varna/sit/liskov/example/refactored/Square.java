package bg.tu_varna.sit.liskov.example.refactored;

public class Square implements Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side*side;
    }
}
