/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = { 2,3,5,7,11,13,17,19,23,29,31,37};
		ArrayList<Integer> ans = new ArrayList<>();
		int sum=10;
		boolean isPossible=partions(arr,sum,0,ans);
		if(isPossible)
		{
		    for(int i:ans)
		    {
		        System.out.print(i+" ");
		    }
		    System.out.println("\nTu mere agal bagal hai.");
		}
		else
		{
		 System.out.println("Not Possible!");   
		}
	}
	public static boolean partions(int arr[],int sum,int i,ArrayList<Integer> ans)
	{
	    if(sum<0 || i>=arr.length) return false;
	    if(sum==0)
	    {
	      return true;  
	    }
	    ans.add(arr[i]);
	    boolean isPossible=partions(arr,sum-arr[i],i+1,ans);
	    if(isPossible) return true;
	    ans.remove(ans.size()-1);
	    return partions(arr,sum,i+1,ans);
	}
}
