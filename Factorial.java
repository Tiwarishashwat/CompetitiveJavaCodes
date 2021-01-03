import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int ans=1;
        while(n>0)
        {
            ans=ans*n;
            n--;
        }
        System.out.println(ans);
    }
}
