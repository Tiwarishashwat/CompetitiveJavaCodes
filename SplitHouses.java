import java.util.*;
class SplitHouses
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int flag=0;
        int n=obj.nextInt();
        String village=obj.nextLine();
        village=obj.nextLine();
        if(village.charAt(0)=='.')
        village = village.substring(0,0)+'B'+village.substring(1); 
        for(int i=1;i<village.length();i++)
        {
        if(village.charAt(i)==village.charAt(i-1) && village.charAt(i)=='H')
        {
            flag=1;
            break;
        }
            if(village.charAt(i)=='.')
            village = village.substring(0,i)+'B'+village.substring(i+1);
        }
        if(flag==1)
        System.out.println("NO");
        else
        {
        System.out.println("YES");
        System.out.println(village);
        }
    }
}
