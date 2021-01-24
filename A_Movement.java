import java.util.*;
class A_Movement
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        int counter=0,var=5;
         while(t!=0 && var>0)
         {
              counter=counter+t/var;
              t=t%var;
              var--;
         }
        System.out.println(counter);
    }
}
