import java.util.*;
class BricksGame
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        int counter=0,p=1,m=2;
        int i=1;
        String ans="";
        while(counter<=t)
        {
            counter+=p*i;
            if(counter>=t) 
            {
                ans="Patlu";
                break;
            }
            counter+=m*i;
            if(counter>=t)
            {
                ans="Motu";
                break;
            }
            i++;
        }
        System.out.println(ans);
    }
}
