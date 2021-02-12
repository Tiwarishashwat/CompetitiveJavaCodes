class Solution{
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) 
    {
        // code here
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        int buy=1,sell=0;
        ArrayList<Integer> bi=new ArrayList<Integer>();
        bi.add(0);
        bi.add(0);
        for(int i=0;i<n-1;i++)
        {
            if(A[i]<A[i+1] && buy==1)
            {
                bi.set(0,i);
                buy=0;
                sell=1;
            }
            else if(A[i]>A[i+1] && sell==1)
            {
                bi.set(1,i);
                al.add(new ArrayList<>(bi));
                sell=0;
                buy=1;
            }
            else if(i==n-2 && sell==1)
            {
                bi.set(1,i+1);
                al.add(new ArrayList<>(bi));
                sell=0;
                buy=1;
            }
        }
        if(sell==1)
        {
            bi.set(1,n-1);
            al.add(new ArrayList<>(bi));
        }
        return al;
    }
}