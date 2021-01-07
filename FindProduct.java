import java.util.*;
class FindProduct
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        long ans=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ans=(ans*arr[i])%(1000000007);
        }        
        System.out.println(ans);
    }
}
