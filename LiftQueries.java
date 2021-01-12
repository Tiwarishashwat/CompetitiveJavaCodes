import java.util.*;
class LiftQueries
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        int A=0;
        int B=7;
        while(t>0)
        {    
            int n=obj.nextInt();
            if(Math.abs(A-n)<Math.abs(B-n))
            {
                A=n;
                System.out.println("A");
            }
             else if(Math.abs(A-n)>Math.abs(B-n))
            {
                B=n;
                 System.out.println("B");
            }
            else
            {
                if(A<B)
                {
                System.out.println("A");
                A=n;
                }
                else
                {
                System.out.println("B");
                B=n;
                }
            }
            t--;
        }
    }
}
