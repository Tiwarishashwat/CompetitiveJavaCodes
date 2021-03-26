/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 },
                    { 1, 1, 0, 1 },
                    { 0, 1, 0, 0 },
                    { 1, 1, 1, 1 } };
        boolean visited [][]=new boolean[4][4];
        System.out.println(shortestPath(maze,0,0,3,3,visited));
	}
	public static boolean isValid(int arr[][],int i,int j,boolean visited[][])
	{
	    int r=arr.length;
	    int c=arr[0].length;
	    if(i>=r || j>=c || i<0 || j<0 || visited[i][j] || arr[i][j]==0)
	    {
	        return false;
	    }
	    return true;
	}
	public static int shortestPath(int arr[][],int i,int j,int x,int y, boolean visited[][])
	{
	    if(!isValid(arr,i,j,visited)) return 1000000;
	    if(x==i && y==j) return 0;
	    visited[i][j]=true;
	    int top=shortestPath(arr,i+1,j,x,y,visited)+1;
	    int bottom=shortestPath(arr,i-1,j,x,y,visited)+1;
	    int right=shortestPath(arr,i,j+1,x,y,visited)+1;
	    int left=shortestPath(arr,i,j-1,x,y,visited)+1;
	    return Math.min(Math.min(top,left),Math.min(bottom,right));
	}
}
