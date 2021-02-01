import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        long sum=0;
        long ans=Long.MAX_VALUE;
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            sum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if((sum-arr[i])%7==0)
            {
                if(arr[i]<ans)
                {
                    ans=arr[i];
                    ind=i;
                }
            }
        }
        System.out.println(ind);
    }
}