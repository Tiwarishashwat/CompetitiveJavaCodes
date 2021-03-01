class GfG
{
    int max_sum(int A[], int N)
    {
	// Your code here
	int sum=0,cursum=0,ans=0,nextsum=0;
    for(int i=0;i<N;i++)
    {
    sum+=A[i];
    cursum+=A[i]*i;
    }
    for(int i=0;i<N;i++)
    {
    nextsum=cursum+A[i]*(N-1)-(sum-A[i]);
    if(ans<nextsum)
    {
         ans=nextsum;
    }
    cursum=nextsum;
    }
return ans;
    }	
}