import java.util.Scanner;
public class SpiralNumbers
{
static int[][] spiralNumbers(int n) 
{
int k=1;
int arr[][]=new int[n][n];
int rowBeg=0,rowEnd=n-1,colBeg=0,colEnd=n-1;
while(rowBeg<=rowEnd && colBeg<=colEnd)
{
    for(int i=colBeg;i<=colEnd;i++)
    {
        arr[rowBeg][i]=k++;
    }
    rowBeg++;
    for(int i=rowBeg;i<=rowEnd;i++)
    {
        arr[i][colEnd]=k++;
    }
    colEnd--;
    if(rowBeg<=rowEnd)
    {
    for(int i=colEnd;i>=colBeg;i--)
    {
        arr[rowEnd][i]=k++;
    }
    rowEnd--;
    }
    if(colBeg<=colEnd)
    {
    for(int i=rowEnd;i>=rowBeg;i--)
    {
        arr[i][colBeg]=k++;
    }
    colBeg++;
    }
}
return arr;
}

	
	public static void main(String[] args) 
	{ 
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[][]=spiralNumbers(n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.println(arr[i][j]);
			}
		}
	} 
} 
