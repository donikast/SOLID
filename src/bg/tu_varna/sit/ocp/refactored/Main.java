package bg.tu_varna.sit.ocp.refactored;


public class Main {

    public static void main(String[] args) {

        GeometricObject cb2 = new Cuboid(5, 10, 15);
        GeometricObject cb1 = new Cuboid(2, 4, 6);
        GeometricObject cb3 = new Cuboid(3, 12, 15);
        GeometricObject sp1 = new Sphere(5);
        GeometricObject sp2 = new Sphere(2);
        GeometricObject sp3 = new Sphere(3);

        GeometricObject[] go_arr = new GeometricObject[6];
        go_arr[0] = cb1;
        go_arr[1] = cb2;
        go_arr[2] = cb3;
        go_arr[3] = sp1;
        go_arr[4] = sp2;
        go_arr[5] = sp3;

        Application app = new Application();

        double vol = app.get_total_volume(go_arr);

        System.out.println("The total volume is " + vol);
    }
}


