import java.util.*;
class PalindromicString
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String input=obj.nextLine();
        int flag=0;
        for(int i=0;i<input.length();i++)
        {
            if((input.charAt(i)!=input.charAt(input.length()-1-i)))
            flag=1;
        }
        if(flag==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
