import java.util.*;
class ToggleString
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String input=obj.nextLine();
        for(int i=0;i<input.length();i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
   input=input.substring(0,i)+Character.toLowerCase(input.charAt(i))+input.substring(i+1);
            }
            else
            {
   input=input.substring(0,i)+Character.toUpperCase(input.charAt(i))+input.substring(i+1);
            }
        }
        System.out.println(input);
    }
}
