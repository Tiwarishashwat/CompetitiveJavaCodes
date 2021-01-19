import java.util.*;
class Sudoku
{
boolean sudoku(int[][] grid) 
{
    HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                int val=grid[i][j];
if((!seen.add(String.valueOf(val)+"Found in row"+i))||(!seen.add(String.valueOf(val)+"Found in col"+j))||(!seen.add(String.valueOf(val)+"Found in sub-grid"+i/3+"-"+j/3))) return false;
            }
        }
    return true;
}
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int n=obj.nextInt();
int m=obj.nextInt();
int arr[][]=new int[n][m];
for(int i=0;i<n;i++)
{
	for(int j=0;J<m;j++)
	{
	arr[i][j]=obj.nextInt();		
	}
}
System.out.println(sudoku(arr));
}
}