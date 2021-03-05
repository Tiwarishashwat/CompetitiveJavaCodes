static void miniMaxSum(int[] arr) {
        long skipmax=Long.MIN_VALUE;
        long skipmin=Long.MAX_VALUE;
        long cursum=0;
        for(int i=0;i<arr.length;i++)
        {
            cursum+=arr[i];
            if(skipmax<arr[i])
            {
                skipmax=arr[i];
            }
            if(skipmin>arr[i])
            {
                skipmin=arr[i];
            }
        }
        System.out.print(cursum-skipmax+" ");
        System.out.println(cursum-skipmin);
    }