import java.util.*;
class LateRide
{
int lateRide(int n) 
{
 int hr=n/60;
 int min=n%60;
 return (hr/10+hr%10+min/10+min%10);
}
public static void main(String args[])
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 System.out.println(lateRide(n));
}
}