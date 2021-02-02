import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        while(true)
        {
            int t=obj.nextInt();
            if(t==42)
            break;
            System.out.println(t);
        }
    }
}
