/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++)
        {
            data[i] = s.nextInt();
        }   
        // Write your code here
         if(data[N-1]%10==0)
        System.out.println("Yes");
        else 
        System.out.println("No");
    }
}