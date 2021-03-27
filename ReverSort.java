import java.util.*;
class Solution
{
    public static void reverse(int arr[],int i,int j)
    {
        int mid=i+j-i/2;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int q=obj.nextInt();
        int x=1;
        while(x<=q)
        {
            int n=obj.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }
            int j=0,i=0;
            int cost=0;
            while(i<n-1)
            {
            int smallest=Integer.MAX_VALUE;
            for(int m=i;m<n;m++)
            {
                if(arr[m]<smallest)
                {
                    smallest=arr[m];
                    j=m;
                }
            }
            cost+=j-i+1;
            reverse(arr,i,j);
            i++;
            }
            System.out.println("Case #"+x+":"+" "+cost);
            x++;
        }
    }
}
