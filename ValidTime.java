import java.util.*;
class ValidTime
{
boolean validTime(String time) 
{
int x= Integer.valueOf(time.substring(0,2));
int y=Integer.valueOf(time.substring(3,5));
if((x>=0 && x<=23) && (y>=0 && y<=59))
{
   return true; 
}
return false;
}
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	String n=obj.next();
        System.out.println(validTime(n));
    }
}

