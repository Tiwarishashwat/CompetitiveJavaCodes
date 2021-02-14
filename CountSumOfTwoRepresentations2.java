int countSumOfTwoRepresentations2(int n, int l, int r)
{
    int counter=0;
    while(l<=r)
    {
        int sum=l+r;
        if(sum==n)
        {
            counter++;
            l++;
            r--;
        }
        else if(sum<n) l++;  
        else r--;
    }
    return counter;
}
