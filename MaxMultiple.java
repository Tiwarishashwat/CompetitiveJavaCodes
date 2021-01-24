import java.util.Scanner;
public class MaxMultiple
{
int maxMultiple(int divisor, int bound)
{
    int ans=bound/divisor;
    return ans*divisor;
}

	public static void main(String[] args) 
	{ 
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		System.out.println(maxMultiple(n,m));
	} 
} 
