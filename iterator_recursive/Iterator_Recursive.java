package iterator_recursive;
/**
 * Test out your sumNum methods;
 * @author Zachery Key
 */

public class Iterator_Recursive {
    public static void main(String[] args) {
        // Create a new array with 5 nodes 
        int[] v = new int[5];
        // Fill each node with a value 
        v[0]=7;
        v[1]=3;
        v[2]=5;
        v[3]=4;
        v[4]=1;
        // Print out the results of the sum computations 
        System.out.print(Summers.SumNumIter(v,4));
        System.out.println();
        System.out.print(Summers.SumNumRecur(v,4));
        System.out.println();
        // Make sure that both algorithms produce same results for other cases
        System.out.print(Summers.SumNumIter(v,2));
        System.out.println();
        System.out.print(Summers.SumNumRecur(v,2));
        System.out.println();
    }
}
