import java.util.Scanner;
class OmaGodTuruLov {
    public static void main(String args[] ) throws Exception {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            String str=obj.next();
            String vowels="";
            int counter1=0,counter2=0;
            for(int i=0;i<str.length();i++)
            {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
             {
                if(!present(vowels,str.charAt(i)))
                {
                    vowels+=str.charAt(i);
                    counter1++;
                }
             }
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
             {
                if(!present(vowels,str.charAt(i)))
                {
                    vowels+=str.charAt(i);
                    counter2++;
                }
             }
            }
            System.out.println(((counter1==5)||(counter2==5))?"lovely string":"ugly string");
            t--;
        }        
    }
    static boolean present(String str, char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
