int arrayPacking(int[] a) 
{
    int n = 0;
    for(int i = a.length-1; i >= 0; i--) 
    {
        n <<= 8;
        System.out.println(n);
        n += a[i];
    }
    return n;
}