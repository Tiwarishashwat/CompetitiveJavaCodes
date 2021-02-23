int[] concatenateArrays(int[] a, int[] b) {
    int n=a.length+b.length;
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        if(i<a.length) arr[i]=a[i];
        else arr[i]=b[i-a.length];
    }
    return arr;
}
