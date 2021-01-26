import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int len=obj.nextInt();
        int nop=obj.nextInt();
        if(len<=23 &&(nop>=500 && nop<=1000))
        {
            System.out.println("Take Medicine");
        }
        else
        {
            System.out.println("Don't take Medicine");
        }
    }
}
