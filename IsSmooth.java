boolean isSmooth(int[] arr) {
    int len=arr.length;
    if(len%2==0)
    {
        int mid=arr[len/2]+arr[len/2-1];
        if(arr[0]==mid && mid==arr[len-1]) return true;
    }
    else
    {
        int mid=len/2;
        if(arr[0]==arr[mid] && arr[mid]==arr[len-1]) return true;
    }
    return false;
}
