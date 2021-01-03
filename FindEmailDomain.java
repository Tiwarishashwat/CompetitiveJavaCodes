import java.util.*;
class FindEmailDomain
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 String s=obj.next();
 System.out.println(findEmailDomain(s));
}
static String findEmailDomain(String address)
{
    int i=0,len=0;
    for(i=0;i<address.length();i++)
    {
        if(address.charAt(i)=='@' && address.charAt(i-1)!='\'' && address.charAt(i+1)!='\'')
        len=i;
    }
    return address.substring(len+1);
}
}
