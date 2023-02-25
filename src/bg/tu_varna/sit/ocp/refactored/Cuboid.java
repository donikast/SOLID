package bg.tu_varna.sit.ocp.refactored;

public class Cuboid implements GeometricObject {
    // Member variables of this class
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * breadth * height;
    }
}
