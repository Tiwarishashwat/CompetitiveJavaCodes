import java.util.*;
class DigitDegree
{
public static void main(String args[])
{
  Scanner obj = new Scanner(System.in);
  int n=obj.nextInt();
  System.out.println(digitDegree(n));
}
int digitDegree(int n) 
{
 int counter=0;
 while(n!=0)
 {
    boolean x=isSingle(n);
    if(x == true)
    {
        break;
    }
    else
    {
        int sum=findSum(n);
        n=sum;
        counter++;
    }
 }
 return counter;
}
static boolean isSingle(int num)
{
    if(num/10==0)
    return true;
    return false;
}
static int findSum(int num)
{
    int sum=0;
    while(num!=0)
    {
        sum=sum+(num%10);
        num=num/10;
    }
    return sum;
}
}