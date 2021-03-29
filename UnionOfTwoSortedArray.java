class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int i=0,j=0,counter=0;
        while(i<n && j<m)
        {
           while(i<n-1 && a[i]==a[i+1])
           {
               i++;
           }
           while(j<m-1 && b[j]==b[j+1])
           {
               j++;
           }
            if(a[i]<b[j])
            {
                counter++;
                i++;
            }
            else if(a[i]>b[j])
            {
                counter++;
                j++;
            }
            else
            {
                counter++;
                i++;
                j++;
            }
        }
        while(i<n-1)
        {
            if(a[i]==a[i+1])
            {
               i++;
            }
            else
            {
                counter++;
                i++;
            }
        }
         while(j<m-1)
        {
            if(b[j]==b[j+1])
            {
               j++;
            }
            else
            {
                counter++;
                j++;
            }
        }
        counter=counter+n-i+m-j;
        return counter;
    }
}