import java.util.*;
class EMazeIn
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String inst=obj.next();
        int x=0,y=0;
        for(int i=0;i<inst.length();i++)
        {
            if(inst.charAt(i)=='L') x--;
            else if(inst.charAt(i)=='R') x++;
            else if(inst.charAt(i)=='D') y--;
            else if(inst.charAt(i)=='U') y++;
        }
        System.out.println(x+" "+y);
    }
}
