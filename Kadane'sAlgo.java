class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        // Your code here
        int cursum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++)
        {
            if(cursum+arr[i]<arr[i])
            {
                cursum=arr[i];
            }
            else
            {
                cursum+=arr[i];
            }
            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
        }
        return maxsum;
    }
};