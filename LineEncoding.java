import java.util.*;
class IsMAC48Address
{
String lineEncoding(String s)
{
    String ans="";
    int counter=1;
    for(int i=1;i<s.length();i++)
    {
        if(s.charAt(i)==s.charAt(i-1)) counter++;        
        else
        {
            if(counter==1) ans=ans+s.charAt(i-1);
            else ans=ans+counter+s.charAt(i-1);
            counter=1;
        }
    }
    if(counter==1) ans=ans+s.charAt(s.length()-1);
    else ans=ans+counter+s.charAt(s.length()-1);
    return ans;
}

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	String str = obj.next();
        System.out.println(lineEncoding(str));
    }
}

