import java.util.*;
class VCPairs
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            int counter=0;
            int n=obj.nextInt();
            String str=obj.next();
            for(int i=0;i<str.length()-1;i++)
            {
if(!(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'))
{
    if(str.charAt(i+1)=='a' || str.charAt(i+1)=='e' || str.charAt(i+1)=='i' || str.charAt(i+1)=='o' || str.charAt(i+1)=='u')
    {
        counter++;
    }
}
            }
            System.out.println(counter);
            t--;
        }
    }
}
