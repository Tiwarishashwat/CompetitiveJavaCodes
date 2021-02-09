import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static int findAnswer(int arr[],Hashtable<Integer,Integer>h,int d)
    {
        for(int i=0;i<arr.length;i++)
		{
		    if(h.containsKey(d+arr[i]))
		      {
		        return 1;
		      }
		}
        return -1;
    }
	public static void main (String[] args) 
	{
		//code
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		while(t>0)
		{
		    int n=obj.nextInt();
		    int d=obj.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<arr.length;i++) arr[i]=obj.nextInt();
		    Hashtable<Integer,Integer>h=new Hashtable<Integer, Integer>(); 
             for(int i=0;i<arr.length;i++)
             {
             h.put(arr[i],i);
             }
		    System.out.println(findAnswer(arr,h,d));
		    t--;
		}
	}
}