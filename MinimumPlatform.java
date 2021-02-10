class Platform
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int current=1;
        int max=1;
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                current++;
                i++;
            }
            else
            {
                current--;
                j++;
            }
            if(current>=max)
            max=current;
        }
        return max;
    }
}