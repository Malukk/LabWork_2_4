package labWork_2_4_5c;

/**
 * Created by Bulik on 19.07.2016.
 */
public class MyCalc {
    public static  double calcPi (int n){
        double pi = 0;
        int con =4;
        for ( int i = 1, d =1; i<=n; i++,d+=2 ){
            pi+= con/(double)d;
            con=-con;
        }
        return pi;

    }
}
