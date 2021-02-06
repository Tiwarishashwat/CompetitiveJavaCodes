class Subarray{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        // Your code here
        ArrayList<Integer> li = new ArrayList<Integer>();
         int curr_sum = arr[0], start = 0, i;
        for (i = 1; i <= n; i++) 
        {
            while (curr_sum > sum && start < i - 1) 
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum) 
            {
                int p = i - 1;
                li.add(start+1);
                li.add(p+1);
                return li;
            }
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
        li.add(-1);
        return li;
    }
}