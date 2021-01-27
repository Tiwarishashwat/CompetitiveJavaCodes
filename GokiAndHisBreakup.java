import java.util.*;
class GokiAndHisBreakup
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int x=obj.nextInt();
        while(n>0)
        {
            String message="NO";
            int y=obj.nextInt();
            if(y>=x) message="YES";
            System.out.println(message);
            n--;
        }
    }
}
