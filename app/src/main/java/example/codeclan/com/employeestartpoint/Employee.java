package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    //    Make the properties of the Employee class private.
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    //    Replace the constructor in Employee with a constructor that takes empId, name, ssn, and salary.
    public Employee(int empId, String name, String ssn, double salary) {
        this.id = empId;
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.salary = salary;
    }

    //    Remove all the setter methods except setName.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    //    Prevent a null or empty value for the setName method.
    public void setName(String name) {
        if (name != "" && name != null){
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //    Add a method named raiseSalary with takes in a parameter of type double to increase the salary.
    //    Prevent a negative value for the raiseSalary method.
    public void raiseSalary(double amount){
        if (amount < 0.00){
            amount = 0.00;
        }
        this.salary += amount;
    }

}

