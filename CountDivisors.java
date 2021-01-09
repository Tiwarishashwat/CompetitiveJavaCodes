import java.util.*;
class CountDivisors
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int l=obj.nextInt();
        int r=obj.nextInt();
        int k=obj.nextInt();
        int counter=0;
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
