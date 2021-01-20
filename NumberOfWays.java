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


class Result 
{
    /*
     * Complete the 'numberOfWays' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY queries as parameter.
     */

    public static List<Long> numberOfWays(List<List<Integer>> queries) 
    {
    // Write your code here
    List<Long> li = new ArrayList<>();
        for(int i=0;i<queries.size();i++)
        {
        long x=(long)(Math.max(queries.get(i).get(0),queries.get(i).get(1)));
        long y=(long)(Math.min(queries.get(i).get(0),queries.get(i).get(1)));
        long sum=0;
        while(y>=1)
        {
            sum+=y*x;
            y--;
            x--;
        }
        li.add(sum);
        }
    return li;
    }
}
public class Solution {