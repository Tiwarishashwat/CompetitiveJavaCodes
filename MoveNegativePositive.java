public class MoveNegativePositive
{
public static void moveNegativePositive(int arr[],int n)
{
 int start=0,end=n-1,index=0;
 while(index<=end && start<end)
 {
   int temp=0;
   if(arr[index]<0)
   {
     temp=arr[index];
     arr[index]=arr[start];
     arr[start]=temp;
     start++;
     index++;
   }
   else
   {
     temp=arr[index];
     arr[index]=arr[end];
     arr[end]=temp;
     end--;
   }
 }
}
public static void main(String args[])
{
  int n=10;
  int arr[]={12,11,-13,0,-5,6,-7,5,-3,6};
  moveNegativePositive(arr,n);
  for(int i=0;i<n;i++)
  {
    System.out.println(arr[i]);
  }
}
}
