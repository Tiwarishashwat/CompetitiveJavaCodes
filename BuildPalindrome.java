import java.util.*;
class BuildPalindrome
{
 static String buildPalindrome(String str) 
 {
    int i = 0;
    while (!isPalindrome(str.substring(i))) i++;
    
    while (--i >= 0) str += str.charAt(i); 
    
    return str;
 }
 static boolean isPalindrome(String s) 
 {
    if (s.length() < 2) return true;
    
    if (s.charAt(0) != s.charAt(s.length()-1)) return false;
    
    return isPalindrome(s.substring(1, s.length() - 1));
 }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println(buildPalindrome(str));
    }
}

