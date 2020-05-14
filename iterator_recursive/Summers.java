package iterator_recursive;
/**
 * The goal of this class is to define the same method two ways, iteratively
 * and recursively. Both of these methods should sum the first n numbers in an 
 * array of integers. 
 * @author Zachery Key
 */

public class Summers{
    // Sum the first n numbers of an array iteratively 
    public static int SumNumIter(int v[],int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum=sum+v[i];}
            return sum;
                       }
    // Sum the first n numbers of an array recursively
    public static int SumNumRecur(int v[],int n){
        // establish base case
        if(n==0){return 0;}
        // establish recursive case
        else{
            n = n-1;
            return v[n]+Summers.SumNumRecur(v,n);
            }
    }
}
