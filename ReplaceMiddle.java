int[] replaceMiddle(int[] arr) {
    int len=arr.length;
    if(len%2==0)
    {
        int mid=arr[len/2]+arr[len/2-1];
        int j=0;
        int ans[]=new int[len-1];
        for(int i=0;i<len;i++)
        {
            if (i==len/2) continue;
            else if (i==len/2-1) ans[j++]=mid;
            else ans[j++]=arr[i];
        }
        return ans;
    }
        return arr;        
}
