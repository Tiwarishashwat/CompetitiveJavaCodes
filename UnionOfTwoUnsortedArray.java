class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> h= new HashSet<>(); 
        //Your code here
        for(int i=0;i<n+m;i++)
        {
            if(i<n)
            {
                h.add(a[i]);
            }
            else
            {
                h.add(b[i-n]);
            }
        }
        return h.size();
       
    }
}