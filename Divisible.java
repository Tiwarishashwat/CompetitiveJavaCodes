import java.io.*;
import java.util.*;
public class Divisible
{
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
          int[] A = new int[N];
          int count=0;
          for(int i=0; i<arr_A.length; i++)
          {
              if(i<arr_A.length/2)
              {
                  if(i%2==0)count+=Integer.valueOf(arr_A[i].charAt(0));
                  else count-=Integer.valueOf(arr_A[i].charAt(0));
              }
              else
              {
    if(i%2==0)count+=Integer.valueOf(arr_A[i].charAt(arr_A[i].length()-1));
    else count-=Integer.valueOf(arr_A[i].charAt(arr_A[i].length()-1));
              }
        }
        String message=(count%11==0)?"OUI":"NON";
         System.out.println(message);
         wr.close();
         br.close();
    }
}