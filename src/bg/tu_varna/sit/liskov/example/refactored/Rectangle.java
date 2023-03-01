package bg.tu_varna.sit.liskov.example.refactored;

public class Rectangle implements Shape {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        return this.length * this.breadth;
    }

    @Override
    public int calculateArea() {
        return length*breadth;
    }
}
