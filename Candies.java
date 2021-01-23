import java.util.*;
class Candies
{
int candies(int n, int m) 
{
return (m/n)*n;
}
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int m=obj.nextInt();
System.out.println(candies(n,m));
}
}
