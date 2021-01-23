import java.util.*;
import java.io.*;
class ArithmaticProgression
{
    public static void main(String args[]) throws Exception
    {
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            int a=Integer.parseInt( str.nextToken() );
            int b=Integer.parseInt( str.nextToken() );
            int c=Integer.parseInt( str.nextToken() );
            int count=Math.abs(2*b-(a+c));
            if(count%2==0) count=count/2;
            else if(count%2!=0) count=(count/2)+1;
            System.out.println(count);
            t--;
        }
    }
}
