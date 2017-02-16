package labWork_2_4_1c;

/**
 * Created by Bulik on 16.07.2016.
 */
public class MyMath {
    private  static  final  double PI = 3.14;

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int elem : array) {
            if (elem < max) {
                max = elem;
            }
        }
        return max;
    }

    public  static double areaOfCircle(double radius){
        return PI * radius * radius;
    }
}
