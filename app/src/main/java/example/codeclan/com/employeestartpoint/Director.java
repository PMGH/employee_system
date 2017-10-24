package example.codeclan.com.employeestartpoint;

/**
 * Created by Peter on 24/10/2017.
 */

//    Create a subclass of Manager called Director.
public class Director extends Manager {
    //    Add a private property to store a double value budget.
    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
        //    Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
        this.budget = budget;
    }

    //    Create a getter method for this property.
    public double getBudget(){
        return this.budget;
    }
}
