package lab_arrays;

/*
 * Author = Zachery Key
 * Date = 9/20/2019
 */

public class Lab_Arrays{
    public static void main(String[] args) {
        /* This is where you will be testing your newly created methods. You have 
         defined a new class of variable Gradelist which contains an array of 
         all of the grades you want, the maximum grade, the average grade and
         a string printout of the arrays. Now all you need to do to use this class
         is to define a new object of that class and then ask for all the info
         you please. */
        
        GradeList mylist = new GradeList(5);
        mylist.setGrade(0,95);
        mylist.setGrade(1,52);
        mylist.setGrade(2,75);
        mylist.setGrade(3,86);
        mylist.setGrade(4,99);
        
        /* The following lines of code become unecessary when you made the method
         .arraystring for the class GradeList */
        
        //System.out.println(mylist.getGrade(0));
        //System.out.println(mylist.getGrade(1));
        //System.out.println(mylist.getGrade(2));
        //System.out.println(mylist.getGrade(3));
        //System.out.println(mylist.getGrade(4));
   
        System.out.println("The Max number is: "+mylist.getMax());
        System.out.println("The average grade in the course was: "+mylist.getAverage());
        System.out.print("The grades in this course are as follows: "+mylist.arrayString());
       
    }
    
}
