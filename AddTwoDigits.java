import java.util.Scanner;
public class AddTwoDigits
{
int addTwoDigits(int n) {
    String st=String.valueOf(n);
    return Character.getNumericValue(st.charAt(0))+Character.getNumericValue(st.charAt(1));
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
