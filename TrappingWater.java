int trappingWater(int arr[], int n)
{
    // Your code here
    int rightmax=0,leftmax=0;
    int l=0,r=n-1;
    int result=0;
    while(l<=r)
    {
        if(arr[l]<=arr[r])
        {
            if(arr[l]>=leftmax) leftmax=arr[l];
            else result+=leftmax-arr[l];
            l++;
        }
        else
        {
            if(arr[r]>=rightmax) rightmax=arr[r];
            else result+=rightmax-arr[r];
            r--;
        }
    }
    return result;
}