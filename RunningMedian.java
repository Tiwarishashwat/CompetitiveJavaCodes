 static double[] runningMedian(int[] a) 
    {
        /*
         * Write your code here.
         */
         double result[]=new double[a.length];
         for(int i=0;i<a.length;i++)
         {
             placeMe(a,i);
             if(i%2!=0)
             {
                 double anse=(a[i/2]+a[(i/2)+1])/2.0;
                 result[i]=anse;
             }
             else 
             {
                 double anso=a[i/2];
                 result[i]=anso;
             }
         }
         return result;
    }
    static void placeMe(int arr[],int j)
    {
        int temp=arr[j];
        j=j-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;
    }
s