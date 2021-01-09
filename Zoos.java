import java.util.*;
class Zoos
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String input=obj.next();
        int counter=0;
        for(int i=0;i<input.length();i++)
            if(input.charAt(i)=='z')counter++;
    System.out.println(((input.length()-counter)==(2*counter))?"Yes":"No");
    }
}
