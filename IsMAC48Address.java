import java.util.*;
class IsMAC48Address
{
static boolean isMAC48Address(String inputString) 
{
 if(inputString.charAt(inputString.length()-1)=='-') return false;
 String arr[]=inputString.split("-");
 if(arr.length!=6) return false;
 for(int i=0;i<arr.length;i++)
 {
     if(arr[i].length()!=2)
     return false;
     int ch1=arr[i].charAt(0);
     int ch2=arr[i].charAt(1);
     if(!(((ch1>=48 && ch1<=57)||(ch1>=65 && ch1<=70))&&((ch2>=48 && ch2<=57)||(ch2>=65 && ch2<=70))))
     {
         return false;
     }
 }
 return true;
}
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	String str = obj.next();
        System.out.println(isMAC48Address(str));
    }
}

