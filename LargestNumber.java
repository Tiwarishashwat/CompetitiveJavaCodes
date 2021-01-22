import java.util.Scanner;
public class LargestNumber
{
int largestNumber(int n) 
{
    int num=0;
    while(n>0)
    {
        num=num*10+9;
        n--;
    }
    return num;
}
	public static void main(String[] args) 
	{ 
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println(largestNumber(n));
	} 
} 
