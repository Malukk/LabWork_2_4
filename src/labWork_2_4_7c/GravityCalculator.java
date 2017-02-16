package labWork_2_4_7c;

/**
 * Created by Bulik on 19.07.2016.
 */
public class GravityCalculator {
    final static double ACCELERATION = 9.81;
    public static double calcDist ( double t) {
        double dist = 0.0;
        double v = 0.0;
        double x = 0.0;
        dist = 0.5 * ACCELERATION * t * t+ v * t + x;
        return dist;
    }

}
