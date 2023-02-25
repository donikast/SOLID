package bg.tu_varna.sit.ocp.refactored;

public class Sphere implements GeometricObject {
    // Storing radius of a sphere
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

