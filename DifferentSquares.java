import java.util.*;
class DifferentSquares
{
int differentSquares(int[][] matrix) 
{
    Set<String> s=new HashSet<>();
    int x=matrix.length;
    int y=matrix[0].length;
for(int i=0;i<x-1;i++)
{
    for(int j=0;j<y-1;j++)
    {
        s.add(myPerson(matrix,i,j));
    }
}
return s.size();
}
String myPerson(int matrix[][],int xpos,int ypos)
{
    return encode(matrix[xpos][ypos],matrix[xpos][ypos+1],matrix[xpos+1][ypos],matrix[xpos+1][ypos+1]);
}
String encode(int a,int b,int c, int d)
{
    return a+""+b+""+c+""+d;
}


    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	int n=obj.nextInt();
	int o=obj.nextInt();
	int matrix[n][o];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<o;j++)
		{
		matrix[i][j]=obj.nextInt();
		}
	}
        System.out.println(differentSquares(matrix));
    }
}

