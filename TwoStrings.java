import java.util.*;
class TwoStrings
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
        String message="YES";
        String str1=obj.next();
        String str2=obj.next();
        Hashtable<Character,Integer> ht=new Hashtable<Character,Integer>();
        for(int i=0;i<str1.length();i++)
        {
            if(ht.containsKey(str1.charAt(i)))
            {
                ht.put(str1.charAt(i),ht.get(str1.charAt(i))+1);
            }
            else
            {
                ht.put(str1.charAt(i),1);
            }
        }
        for(int i=0;i<str2.length();i++)
        {
            if(ht.containsKey(str2.charAt(i)))
            {
                ht.put(str2.charAt(i),ht.get(str2.charAt(i))-1);
                if(ht.get(str2.charAt(i))==0)
                ht.remove(str2.charAt(i));
            }
            else
            {
                message="NO";
                break;
            }
        }
        System.out.println(message);
            t--;
        }
    }
}
