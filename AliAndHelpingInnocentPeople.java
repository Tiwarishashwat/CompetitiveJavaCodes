import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String plate=obj.next();
        String result="valid";
        int sum=0;
        for(int i=0;i<8;i++)
        {
            if (i==2)
            {
if(plate.charAt(i)=='A'||plate.charAt(i)=='E'||plate.charAt(i)=='I'||plate.charAt(i)=='O'||plate.charAt(i)=='U'||plate.charAt(i)=='Y')
{
    result="invalid";
    break;
}
continue;
            }
            else if(i==6||i==1 || i==5)
            {
                continue;
            }
            else
            {
                sum=Character.getNumericValue(plate.charAt(i))+Character.getNumericValue(plate.charAt(i+1));
            }
            if(sum%2!=0)
            {
                result="invalid";
            }
            sum=0;
        }
        System.out.println(result);
    }
}
