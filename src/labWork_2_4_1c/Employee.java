package labWork_2_4_1c;

/**
 * Created by Bulik on 16.07.2016.
 */
public class Employee {
    private static  int numberOfEmployees;
    private String firstName, lastName, occupation, telephone;

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }
}
