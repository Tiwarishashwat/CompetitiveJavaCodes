class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int min=0,max=0;
        int result=arr[n-1]-arr[0];
        for(int i=1;i<=n-1;i++)
        {
            if(arr[i]>=k)
            {
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                min=Math.min(arr[0]+k,arr[i]-k);
                result=Math.min(result,max-min);
            }
            else
            {
                continue;
            }
        }
        return result;
    }
}