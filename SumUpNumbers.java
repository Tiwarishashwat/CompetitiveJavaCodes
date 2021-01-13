import java.util.*;
class SumUpNumbers
{
int sumUpNumbers(String inputString)
{
        String temp = "0";   
        int sum = 0;  
        for (int i = 0; i < inputString.length(); i++)
        { 
            char ch = inputString.charAt(i);
            if(i==inputString.length()-1)
            {
                
                if (Character.isDigit(ch))
                { 
                temp+=ch;
                sum += Integer.parseInt(temp); 
                }
            }  
            if (Character.isDigit(ch)) 
                temp += ch;  
            else 
            { 
                sum += Integer.parseInt(temp);  
                temp = "0"; 
            } 
        } 
    return sum;
}

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
	String n=obj.next();
        System.out.println(sumUpNumbers(n));
    }
}

