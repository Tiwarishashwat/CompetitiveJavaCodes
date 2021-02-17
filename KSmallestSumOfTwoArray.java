import java.io.*;
class KSmallestPair
{
	static void kSmallestPair(int arr1[], int n1, int arr2[],int n2, int k)
	{
		if (k > n1*n2)
		{
			System.out.print("k pairs don't exist");
			return ;
		}
		int index2[] = new int[n1];	
		while (k > 0)
		{
			int min_sum = Integer.MAX_VALUE;
			int min_index = 0;
			for (int i1 = 0; i1 < n1; i1++)
			{
				
				if (index2[i1] < n2 && arr1[i1] + arr2[index2[i1]] < min_sum)
				{
					min_index = i1;
					min_sum = arr1[i1] + arr2[index2[i1]];
				}
			}
			System.out.print("(" + arr1[min_index] + ", " +arr2[index2[min_index]]+ ") ");
			index2[min_index]++;
			k--;
		}
	}

	public static void main (String[] args)
	{
		int arr1[] = {1, 3, 11};
		int n1 = arr1.length;
	
		int arr2[] = {2, 4, 8};
		int n2 = arr2.length;
	
		int k = 4;
		kSmallestPair( arr1, n1, arr2, n2, k);
	}
}
/*This code is contributed by Prakriti Gupta*/
