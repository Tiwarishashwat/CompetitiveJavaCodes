import java.util.*;
class SeatingArrangement
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            int sno=obj.nextInt();
            int rem=sno%12;
            //int div=sno/6;
            int ans=0;
            String ans2="";
            if(rem>=1 && rem<=6 )
            {
                ans=sno+((6-rem)*2)+1;
                int rem2=ans%6;
                if(rem2==0 || rem2==1) 
                {
                    ans2="WS";
                }
                else if(rem2==2 || rem2==5)
                {
                    ans2="MS";
                }
                else
                {
                    ans2="AS";
                }
            }
            else
            {
                ans=sno-((Math.max(rem,6)-Math.min(rem,6))*2)+1;
                int rem2=ans%6;
                if(rem2==0 || rem2==1) 
                {
                    ans2="WS";
                }
                else if(rem2==2 || rem2==5)
                {
                    ans2="MS";
                }
                else
                {
                    ans2="AS";
                }
            }
            System.out.println(ans+" "+ans2);
            t--;
        }
    }
}
