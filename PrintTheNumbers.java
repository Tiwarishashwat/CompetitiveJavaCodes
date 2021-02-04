import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            int num=obj.nextInt();
            System.out.print(num+" ");
            t--;
        }
    }
}
