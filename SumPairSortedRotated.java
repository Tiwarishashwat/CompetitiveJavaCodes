import java.util.*;
class Solution
{
  public static boolean binsearch(int nums[],int s,int e,int k)
    {
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(nums[mid]==k) return true;
            else if(nums[mid]<k) s=mid+1;
            else if(nums[mid]>k) e=mid-1;
        }
        return false;
    }
 public static int PairSearch(int nums[],int k)
 {
  //Searching for pivot element using binary search (Smallest of all)
  int s=0,e=nums.length-1;
  int mid=s+(e-s)/2;
  while(s<e)
  {
   if(nums[mid]>nums[e]) s=mid+1;
   else e=mid;
  }
  //s has smallest element index
  if(k>=nums[0]&&k<=nums[mid-1])
  { 
   return binsearch(nums,0,mid-1,k);
  }
  else if(k>=nums[mid+1]&&k<=nums[n-1])
  {
	return binsearch(nums,mid+1,n-1,k);
  }
  return false;
 }
 public static void main(String args[])
 {
  int n,k;
  Scanner obj = new Scanner(System.in);
  int nums[]=new int[n];
  for(int i=0;i<n;i++)
  {
   nums[i]=obj.nextInt();
  }
   k=obj.nextInt();
   System.out.println(PairSearch(nums,k));
 }
}