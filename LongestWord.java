import java.util.*;
class LongestWord
{
String longestWord(String text)
{
    int counter=0;
    String ans="";
    String arr[]=text.split("[^a-zA-Z]");
    for(int i=0;i<arr.length;i++)
    {
     if(counter<=arr[i].trim().length())
      {
          counter=arr[i].trim().length();
          ans=arr[i].trim();
      }  
    }
    return ans;
}

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	String n=obj.next();
        System.out.println(longestWord(n));
    }
}

