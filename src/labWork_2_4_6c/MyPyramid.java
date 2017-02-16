package labWork_2_4_6c;

/**
 * Created by Bulik on 19.07.2016.
 */
public class MyPyramid {
    public static void printPyramid(int h){
        if (h < 1 || h > 9){
            System.out.println(" No puramid ");
            return;
        }
        for ( int level = 1; level <= h; level++){
            char ch = ' ';
            for (int spase = h - level;spase>0 ; spase-- ){
                System.out.print(ch);
            }
           for (int value = 1; value <= level; value++){
               System.out.print(value);
           }
            for (int value = level-1; value>=1; value--){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
