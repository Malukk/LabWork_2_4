package labWork_2_4_1c;

/**
 * Created by Bulik on 16.07.2016.
 */
public class Main {
    /// Lab _2_4_1 and 2_4_2
    public static void main(String[] args) {
        int [] arrayInt = {4, 0, 2, 9, -3, -11, -9, 12, 7 };
    System.out.println("Min ="+ MyMath.findMin(arrayInt));
        System.out.println("Max = "+ MyMath.findMax(arrayInt));
        /////lab 2_4_3
        System.out.println("\n Lab_2_4_3");
        System.out.println("area of circle ->" + /*new MyMath().areaOfCircle(10)*/
        MyMath.areaOfCircle(3.56));

        //lab 2_4_4
        System.out.println("\n Lab_2_4_4");
        Employee employee1 = new Employee("Masha", "Govdu", "worker", "(099)8767721");
        System.out.println("namber = " + Employee.getNumberOfEmployees());
        Employee employee2 = new Employee("Olga", "Povdu", "worker", "(096)8767721");
        System.out.println("namber = " + Employee.getNumberOfEmployees());
}
}