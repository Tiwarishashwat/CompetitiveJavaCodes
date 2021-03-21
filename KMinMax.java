import java.util.*;
public class KMinMax
{
  public static void main(String args[])
  {
    Scanner obj = new Scanner(System.in);
    int arr[]={10,20,15,12,40,25,18};
    Heap hs=new Heap();
    System.out.println("Enter the value of k:");
    int k=obj.nextInt();
    if(k<1 || k>arr.length)
    {
      System.out.println("Not in range");
      return;
    }
      System.out.println("Orignal Array is:");
      hs.printArray(arr);
    hs.sort(arr,k);
  }
  void sort(int arr[],int k)
  {
    int len=arr.length;
    for(int i=len/2-1;i>=0;i--)
    {
      heapify(arr,len,i);
    }
    int count=1;
    int ans;
    //Swap the elements and heapify again (deletion and add at end)
    for(int i=len-1;i>=0;i--)
    {
      if(count==k)
      {
        ans=arr[0];
        System.out.println(k+" th highest element:\t"+ans);
        break;
      }
      int temp=arr[0];
      arr[0]=arr[i];
      arr[i]=temp;
      heapify(arr,i,0);
      count++;
    }
  }
  void heapify(int arr[], int n,int i)
  {
    int largest=i; //parent node index position //10
    int left=2*i+1; //left child index position //30
    int right=2*i+2; //right child index position //40
    if(left<n && arr[left]>arr[largest])
    {
      largest=left; //3
    }
    if(right<n && arr[right]>arr[largest])
    {
      largest=right; //4
    }
    if(largest!=i) //4 != 1
    {
      int temp=arr[i];
      arr[i]=arr[largest];
      arr[largest]=temp;
      heapify(arr,n,largest);  //arr, 5, 4
    }
  }
  void printArray(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+",");
    }
    System.out.println();
  }
}
