
package lab_arrays;
import java.util.Arrays;

/*
 This part of the Code contains the construction methods and other methods 
associated with the class GradeList. 
 */

public class GradeList {
    // Declare the local variable to be used in this class. This is the fields
    // section of your code. Here you will define the variable definition grades 
    // which is an array of doubles.
    private double[] grades;
   
    //This next item is the Constructor. It should have the parameter Listsize
    // and create the object which is initialized whenever you start the program.
    public GradeList(int listsize){
        grades = new double[listsize];}
    
    //Now you need to define the methods to input grades into the double array 
    //you have created. Start with looking for the maximum value in the array.
    public double getMax(){
        double highestnum = 0;
        int len = grades.length;
        for(int i=0;i<len; ++i){
            if(grades[i]>highestnum){
                highestnum = grades[i];
                }
            }
        return highestnum;}
    
    //Now you should create the method to get the grade at any user specified 
    // index. This will allow you to perform more complex calculations in the 
    // future.
    public double getGrade(int i){
        double value = grades[i];
        return value;
        }
    
    // You are ready to set the values in the array with the method setGrade. 
    public void setGrade(int i,double newGradeVal){
        grades[i] = newGradeVal;
    }
    
    // If you want to print the array as an array in python, you need to 
    // convert it to a string first. This makes our tester easier to write.
    public String arrayString(){
        String printout = Arrays.toString(grades);
        return printout;
    }
    
    //Take the average of all of the grades
    public double getAverage(){
        int len = grades.length;
        double sum = 0;
        for(int i=0;i<len; ++i){
        sum = sum + grades[i];}
        int x = (int)sum;
        int avg = x/len;
        return avg;
        }
    }
