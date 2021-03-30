class Solution
{
  public static void swap(int arr[],int i,int j)
  {
  int temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp;
  }

  public static void quick(int arr[],int l,int h)
  {
    if(l<h)
    {
      int p=partition(arr,l,h);
      quick(arr,l,p-1);
      quick(arr,p+1,h);
    }
  }

  public static int partition(int arr[],int l,int h)
  {
    int pivot=arr[l];
    int i=l;
    int j=h;
    while(i<j)
    {
      while(arr[i]<=pivot && i<h)
      {
        i++;
      }
      while(j>=l && arr[j]>pivot)
      {
        j--;
      }
      if(i<j)
      {
        swap(arr,i,j);
      }
    }
    swap(arr,l,j);
    return j;
  }

  public static void main(String args[])
  {
    int arr[]={8,6,3,1,11,55,9,99,7};
    quick(arr,0,8);
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
