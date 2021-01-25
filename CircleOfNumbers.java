import java.util.*;
class CircleOfNumber
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 int n=obj.nextInt();
 int firstNumber=obj.nextInt();
 System.out.println(circleOfNumbers(n,firstNumber));
}
int circleOfNumbers(int n, int firstNumber)
{
 return ((n/2+firstNumber)%n);
}
}