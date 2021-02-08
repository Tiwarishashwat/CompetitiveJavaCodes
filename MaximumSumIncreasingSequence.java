class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	     // Your code goes here
	    int dp[]=new int[n];
	    for(int i=0;i<n;i++) dp[i]=arr[i];
	    for(int i=1;i<n;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(arr[j]<arr[i] && dp[i]<dp[j]+arr[i])
	            {
	                dp[i]=dp[j]+arr[i];
	            }
	        }
	    }
	    int sum=dp[0];
	    for(int i=1;i<n;i++)
	    {
	        if(dp[i]>sum) 
	            {
	               sum=dp[i];
	            }
	    }
	    return sum;
	}  
}