import java.util.Scanner;
public class Max9Sum
{
	public static void main(String[] args) 
	{
	    Scanner obj=new Scanner(System.in);
	    int t=obj.nextInt();
	    while(t>0)
	    {
	    int n=obj.nextInt();
	    int nums[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        nums[i]=obj.nextInt();
	    }
		System.out.println(max9sumq(nums,n));
		t--;
          }
        }
      public static int max9sumq(int nums[], int n)
	{
	int sum=0,maxsum=0,max9sum=0,count9=0,counter9=0,s=0,e=2;
        for(int i=s;i<=e;i++)
        {
            if(nums[i]==9)count9+=1;
            maxsum=maxsum+nums[i];
        }
        s+=1;
        e+=1;
        if(count9!=0)max9sum=maxsum;
        counter9=count9;
	sum=maxsum;
        while(s<n-2 && e<n)
        {
            sum=sum-nums[s-1]+nums[e];
            if(nums[s-1]==9)count9-=1;
            if(nums[e]==9)count9+=1;
            if(count9!=0 && counter9<=count9)
	       {
	         if(max9sum<sum)max9sum=sum;
	         counter9=count9;
	        }
	     else if(maxsum<sum)maxsum=sum;
             e++;
             s++;
        }
    if(max9sum==0)
    return maxsum; 
    else
    return max9sum;
    }
}