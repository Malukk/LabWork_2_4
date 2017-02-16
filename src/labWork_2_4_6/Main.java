package labWork_2_4_6;

import java.util.Scanner;

/**
 * Created by Bulik on 17.07.2016.
 */
public class Main {
    public static void main(String[] args) {
//     MyPyramid myPyramid = new MyPyramid();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of pyramid -> : ");
        int h = scanner.nextInt();
        int t=h+1;

    if (h <= 9 && h >= 1){
        for (int i = 1; i < h + 1; i++){
            t--;
            for (int q = t; q > 1; q--){
                System.out.print(" ");
            }
            for(int j = 1; j<i; j++){
                System.out.print(j);
            }
            for(int w = i; w>0; w--){
                System.out.print(w);
            }
            System.out.println();
        }
    }
        if (h>9 || h<1){
            System.out.println("The number out of range 1-9");

        }
    }
}
