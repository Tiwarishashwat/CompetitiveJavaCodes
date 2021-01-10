import java.util.*;
class DeleteDigit
{
int deleteDigit(int n)
{
    String ans =String.valueOf(n);
    int val=Integer.valueOf(ans.substring(1));
    for(int i=1;i<ans.length();i++)
    {
        int cval=Integer.valueOf(ans.substring(0,i)+ans.substring(i+1));
        if(cval>val) val=cval;
    }
return val;
}

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	int n=obj.nextInt();
        System.out.println(deleteDigit(n));
    }
}

