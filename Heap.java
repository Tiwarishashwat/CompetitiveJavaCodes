public class Heap {
  public static void main(String args[])
  {
    int arr[]={10,20,15,12,40,25,18};
    Heap hs=new Heap();
    System.out.print("Orignal array:\t");
    hs.printArray(arr);
    hs.sort(arr);
    hs.printArray(arr);
  }
  void sort(int arr[])
  {
    int len=arr.length;
    for(int i=len/2-1;i>=0;i--)
    {
      heapify(arr,len,i);
    }
    System.out.print("Created heap:\t");
    printArray(arr);
    //Swap the elements and heapify again (deletion and add at end)
    //40, 30, 15, 10, 20
    // 20, 30, 15, 10, 40
    for(int i=len-1;i>=0;i--)
    {
      int temp=arr[0];
      arr[0]=arr[i];
      arr[i]=temp;
      System.out.print("Printing at each pass:\t");
      printArray(arr);
      heapify(arr,i,0);
      System.out.print("Heap at each pass:\t");
      printArray(arr);
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
