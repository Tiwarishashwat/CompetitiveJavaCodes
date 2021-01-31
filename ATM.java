/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ag[]=br.readLine().trim().split(" ");
		Double x=Double.parseDouble(ag[0]);
		Double y=Double.parseDouble(ag[1]);
	    Double ans=0.00;
	    if(x%5==0)
	    {
	        if((x+0.50)<=y)
	        ans=y-(x+0.50);
	        else
	        ans=y;
	    }
	    else
	    {
	        ans=y;
	    }
	    System.out.println(Math.round(ans * 100.0) / 100.0);
	}
}
