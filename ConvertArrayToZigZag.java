class Solution {
    void zigZag(int arr[], int n) 
    {
        // code here
	    int flag=0;
	    for(int i=0;i<n-1;i++)
	    {
	        if(flag==0) 
	        {
	            if(arr[i]>arr[i+1])
	            {
	                int temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	            flag=1;
	        }
	        else
	        {
	            if(arr[i]<arr[i+1])
	            {
	                int temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	            flag=0;   
	        }
	    }
    }

}