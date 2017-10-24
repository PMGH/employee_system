package example.codeclan.com.employeestartpoint;

/**
 * Created by Peter on 24/10/2017.
 */

//    Create a subclass of Employee called Manager in the same package.
public class Manager extends Employee {
    //    Add a property to store the department name in a property called deptName.
    private String deptName;

    //        Create a constructor that includes all the parameters needed for Employee and deptName.
    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    //        Add a getter method for deptName.
    public String getDeptName(){
        return this.deptName;
    }
}




