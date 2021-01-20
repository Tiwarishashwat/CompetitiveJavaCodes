import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'maxSubjectsNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY answered
     *  2. INTEGER_ARRAY needed
     *  3. INTEGER q
     */

    public static int maxSubjectsNumber(List<Integer> answered, List<Integer> needed, int q) {
    // Write your code here
    int ans=0;
    int additional[]=new int[answered.size()];
    for(int i=0;i<additional.length;i++)
    {
        if(needed.get(i)-answered.get(i)<=0) additional[i]=0;
        else additional[i]=needed.get(i)-answered.get(i);
    }
    Arrays.sort(additional);
    for(int i=0;i<additional.length;i++)
    {
        int temp=additional[i];
        if(q>0)
        {
            if(additional[i]<=q)
            {
                additional[i]=0;
                q=q-temp;
                ans++;
            }
        } 
    }
    return ans;
    }

}
