import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) 
    {
        // int size=0;
        int sum=0;
        List<Integer> li=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) continue;
            sum=(countNonZeros(arr,i));
            li.add(sum);
        }
        int result[]=new int[li.size()];
        for(int j=0;j<result.length;j++)
        {
            result[j]=li.get(j);
        }
        return result;
    }
    static int countNonZeros(int arr[],int i)
    {
        int val=arr[i];
        int n=0;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                n++;
            }
            arr[j]=arr[j]-val;
        }
        return n;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
