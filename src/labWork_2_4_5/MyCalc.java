package labWork_2_4_5;

import java.util.Scanner;

/**
 * Created by Bulik on 17.07.2016.
 */
public class MyCalc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the n -> : ");
        int n = scanner.nextInt();
        double p=0.0;
        int j=1;
        int w=1;


        for (int i = 1; i < n+1; i ++, j=j+2,w++) {
                if (i%2!=0){
                p +=(double)4.0 / j;
                }
               else if (i%2==0) {
                    p -= (double) 4.0 / j;
                }
            System.out.println(w+":operation "+p);
        }
        System.out.println("--------------");
        System.out.println("Result :"+p);



    }
}
