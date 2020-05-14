package labinheritance;

/**
 * When you say that manager extends employee it means that manager
 * inherits all of the same methods and data fields as employee. This
 * being said, you can still add additional fields to the manager class,
 * such as department or bonus. 
 * @author Zachery Key
 */

public class Manager extends Employee {
    int bonus;
    String department;
    
    public String to_String(){
        return department+" "+name;
        }
    public int get_salary(){
        return salary+bonus;
        }
    
}
