//User function Template for Java

class Compute {
    
    public void rotate(long arr[], long n)
    {
        long temp=arr[(int)(n-1)];
        for(int i=(int)(n-2);i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
}