class EquilibriumPoint {

    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n) 
    {
        // Your code here
        if(n==1)
        return 1;
        long lsum=0,rsum=arr[n-1];
        for(int i=0;i<n-2;i++)
        {
            lsum+=arr[i];
        }
        int i=n-3;
        while(i>=0 && lsum!=rsum)
        {
            lsum=lsum-arr[i];
            rsum=rsum+arr[i+1];
            if(lsum==rsum)
            {
                return i+1;
            }
            i--;
        }
        return -1;
    }
}