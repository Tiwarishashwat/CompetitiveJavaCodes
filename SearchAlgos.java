/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
     public static int jumpSearch(int arr[],int target)
    {
        int n=arr.length,size=(int)Math.sqrt(n);
        int start=0,end=size;
        int times=n/size;
        while(times>0 && end<arr.length)
        {
            if(target>=arr[start] && target <=arr[end])
            {
                for(int i=start;i<=end;i++)
                {
                    if(arr[i]==target)
                    return i+1;
                }
                return -1;
            }
            start+=size;
            end+=size;
            times--;
        }
        for(int i=end;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i+1;
            }
        }
        return -1;
    }
    public static int linearSearch(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int target)
    {
        int i=0;
        int j=arr.length-1;
        int  mid=i+(j-i)/2;
        while(i<j)
        {
            if(arr[mid]==target)
            {
                return mid+1;
            }
            if(arr[mid]>target)
            {
                j=mid;
            }
            else
            {
                i=mid+1;
            }
            mid=i+(j-i)/2;
        }
        return -1;
    }
	public static void main(String[] args) {
	    int arr[]={2,11,7,6,9,3,6,15,87,99,112,7,160,43,78};
		System.out.println("I am linear search");
		System.out.println(linearSearch(arr,99));
		System.out.println("I am binary search");
		int b[]=arr.clone();
		Arrays.sort(b);
		System.out.println(binarySearch(b,99));
		System.out.println("I am jump search");
		System.out.println(jumpSearch(b,99));
		
	}
}
