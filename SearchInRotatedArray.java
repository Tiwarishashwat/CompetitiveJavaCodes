/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static int binsearch(int nums[],int s,int e,int k)
    {
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(nums[mid]==k) return mid;
            else if(nums[mid]<k) s=mid+1;
            else if(nums[mid]>k) e=mid-1;
        }
        return -1;
    }
	public static void main (String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int t= obj.nextInt();
		while(t>0)
		{
		 int n=obj.nextInt();
		 int ans=0;
		 int arr[] = new int[n];
		 for(int i=0;i<n;i++) arr[i]=obj.nextInt();
		 int k=obj.nextInt();
		 for(int i=0;i<n-1;i++)
		 {
		    if(arr[i]>arr[i+1])
		    { 
		        ans=i;
		        break;
		    }
		 }
		 int f=-1;
		 if(k>=arr[0]&&k<=arr[ans]) f=binsearch(arr,0,ans,k);
		 else if(k>=arr[ans+1]&&k<=arr[n-1]) f=binsearch(arr,ans+1,n-1,k);
		 System.out.println(f);
		    t--;
		}
	}
}