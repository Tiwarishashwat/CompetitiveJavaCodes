import java.util.*;
class IsDigit
{
boolean isDigit(char symbol)
{
    if(symbol>=48 && symbol<=57)return true;
    return false;
}
public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	char ch = obj.next();
	System.out.println(isDigit(ch));
    }
}
