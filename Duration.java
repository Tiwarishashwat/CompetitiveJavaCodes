import java.util.*;
class Duration
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            int sh=obj.nextInt();
            int sm=obj.nextInt();
            int eh=obj.nextInt();
            int em=obj.nextInt();
            int dh=0,dm=0;
            dm=(eh*60+em)-(sh*60+sm);
            dh=dm/60;
            dm=dm%60;
            System.out.println(dh+" "+dm);
            t--;
        }
    }
}
