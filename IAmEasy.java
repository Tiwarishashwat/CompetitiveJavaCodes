import java.util.*;
class IAmEasy
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(i*t);
            i++;
        }
    }
}
