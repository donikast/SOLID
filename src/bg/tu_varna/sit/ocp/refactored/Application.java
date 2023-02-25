package bg.tu_varna.sit.ocp.refactored;

public class Application {

    public double get_total_volume(GeometricObject[] go_arr) {
        double vol_sum = 0;

        for (GeometricObject geo_obj : go_arr) {
            vol_sum += geo_obj.calculateVolume();
        }
        return vol_sum;
    }
}
