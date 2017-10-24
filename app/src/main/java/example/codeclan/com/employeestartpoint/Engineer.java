package example.codeclan.com.employeestartpoint;

/**
 * Created by Peter on 24/10/2017.
 */

//    Create subclasses of Employee: Engineer and Admin.
public class Engineer extends Employee {
    //    These should take in same parameters as Employee and pass to Employee constructor.
    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
}
