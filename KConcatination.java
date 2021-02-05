import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
     public static long maxSubArray(int[] nums,int n) 
    {
        long sum=nums[0];
        long cursum=nums[0];
        for(int i=1;i<n*nums.length;i++)
        {
            int x=nums[i%nums.length];
            if(cursum+x<x) cursum=x;
            else cursum=cursum+x;
            if(cursum>sum) sum=cursum;
        }
        return sum;
    }
    public static long sumArray(int[] nums) 
    {
        long sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner obj=new Scanner(System.in);
	    int t=obj.nextInt();
	    while (t>0) 
	    {
		int n, k;
		n=obj.nextInt();
		k=obj.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) arr[i]=obj.nextInt();
		long maxsum=maxSubArray(arr,1);
		long allsum=sumArray(arr);
		long ans=0;
		if(k==1) ans=maxsum;
		else if(k>=2)
		{
		    if(allsum<0)
		    {
		        ans=maxSubArray(arr,2);
		    }
		    else
		    {
		        ans=maxSubArray(arr,2)+(k-2)*allsum;
		    }
		}
		System.out.println(ans);
		t--;
	    }
    }
}