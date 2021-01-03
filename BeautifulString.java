class BeautifulString
{
public static void main(String args[])
{
 Scanner obj = new Scanner(System.in);
 String s=obj.next();
 System.out.println(isBeautifulString(s));
}
static boolean isBeautifulString(String inputString) 
{
   int counter[]=new int[26];
   for(int i=0;i<inputString.length();i++)
   {
       counter[inputString.charAt(i)-97]++;
   }
   for(int i=1;i<counter.length;i++)
   {
       if(counter[i]>counter[i-1])
       return false;
   }
   return true;
}
}