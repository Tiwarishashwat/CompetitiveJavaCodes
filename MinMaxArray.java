public static minmax(int arr[])
{
  int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
  for(int i=0;i<arr.length();i++)
  {
    if(max<arr[i])
    {
      max=arr[i];
    }
    else if(min>arr[i])
    {
      min=arr[i];
    }
  }
  System.out.println(min);
  System.out.println(max);
}
