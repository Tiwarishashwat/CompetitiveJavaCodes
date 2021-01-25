import java.util.*;
class PairsDelhivery
{
 public static void main(String args[])
 { 
	Scanner obj = new Scanner(System.in);
	int t=obj.nextInt();
	while(t>0)
	{
	int a=obj.nextInt();
	int b=obj.nextInt();
	int n=obj.nextInt();
	while(n>1)
	{
		int temp_a=a;
		int temp_b=b;
		a=temp_b-temp_a;
		b=temp_b+temp_a;
		n--;	
	}
	System.out.println(a+" "+b);
	t--;
	}
 }
}


