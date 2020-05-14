package labinheritance;

/**
 * Tester class for your other code in file LabInheritance. 
 * @author Zachery Key
 */

public class Tester{
    public static void main(String []args){
        Employee e1 = new Employee();
        e1.name = "Peter";
        e1.set_salary(100);
        System.out.println(e1.name+" is a "+e1.getClass().getName()+" and earns "+e1.salary);
        Manager m1 = new Manager();
        m1.name = "Michelle";
        m1.bonus = 200;
        //m1.salary = 1200;
        m1.department = "Finance";
        System.out.println(m1.name+" is a "+m1.getClass().getName()+" and earns "+m1.get_salary()+" and is part of the "+m1.department+" department.");
        Executive exec1 = new Executive();
        exec1.name = "Andrea";
        exec1.bonus = 500;
        //exec1.salary = 2000;
        exec1.department = "Strategic Planning";
        System.out.println(exec1.name+" is a "+exec1.getClass().getName()+" and earns "+exec1.get_salary()+" and is part of the "+exec1.department+" department.");
    }
}
