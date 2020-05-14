package labinheritance;

/**
 This is the class Employee the Program Inheritance Lab 
 The data fields you are working with are name and salary
 and the necessary methods are get salary and set salary.
 Remember get salary will return the salary value but set 
 salary will not return anything (void). 
 */

public class Employee {
    String name;
    int salary;
    
    public int get_salary() {
        return salary;
    }
    public void set_salary(int salary){
        this.salary = salary;
    }
   
    
}
