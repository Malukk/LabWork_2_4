package labWork_2_4_6c;

import java.util.Scanner;

/**
 * Created by Bulik on 19.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter h");
        //MyPyramid.printPyramid(scanner.nextInt());
        int h = scanner.nextInt();
        MyPyramid.printPyramid(h);

    }
}
