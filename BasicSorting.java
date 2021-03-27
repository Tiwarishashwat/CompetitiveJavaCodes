/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println("Already Sorted");
                break;
            }
        }
    }
    
    public static void selectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[index]>arr[j])
                {
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    
    public static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Elements:   "+arr[i]);
        }
    }
	public static void main(String[] args) {
	    int arr1[]={2,11,7,6,9,3,6,15,87,99,112,7,160,43,78};
	    int arr2[]={2,11,7,6,9,3,6,15,87,99,112,7,160,43,78};
	    int arr3[]={2,11,7,6,9,3,6,15,87,99,112,7,160,43,78};
 		System.out.println("After Bubble sort");
 		bubbleSort(arr1);
 		print(arr1);
 		
 		System.out.println("After Selection sort");
 		selectionSort(arr2);
 		print(arr2);
		
		System.out.println("After Insertion sort");
		insertionSort(arr3);
		print(arr3);

		
	}
}
