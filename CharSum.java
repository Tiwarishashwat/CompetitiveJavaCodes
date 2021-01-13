import java.util.*;
class CharSum
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String str=obj.next();
        int sum=0;
        for(int i=0;i<str.length();i++)
            {
                sum=sum+(str.charAt(i)-96);
            }
        System.out.println(sum);
    }
}
