/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG 
    {
    static int findMinDiff(int arr[], int n,int m)
    {
        if (m == 0 || n == 0) return 0;
        Arrays.sort(arr);
        if (n < m) return -1;
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff) min_diff = diff;
        }
        return min_diff;
    }
	public static void main (String[] args) 
	{
		//code
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		while(t>0)
		{
		    int n=obj.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++) arr[i]=obj.nextInt();
		    int m=obj.nextInt();
		    System.out.println(findMinDiff(arr,n,m));
		    t--;
		}
	}
}