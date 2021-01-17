public class MessageFromBinaryCode
{
String messageFromBinaryCode(String code) 
{
    String message="";
    String temp="";
    int checker=7;
    for(int i=0;i<code.length();i++)
    {
        temp+=code.charAt(i);
        if(i==checker)
        {
            int d=findDecimal(temp);
            char ch=(char)(d);
            message+=ch;
            checker+=8;
            temp="";
        }
        else if(i==code.length()-1)
        {
            int d=findDecimal(temp);
            char ch=(char)d;
            message+=ch;
        }
    }
    return message;
}
static int findDecimal(String str)
{
    if(str.length()!=8)
    {
        int times=8-str.length();
        String temp="";
        for(int i=0;i<times;i++)
        {
            temp+="0";
        }
        str=temp+str;
    }
    int equi=0;
    for(int i=str.length()-1;i>=0;i--)
    {
        equi+=(Character.getNumericValue(str.charAt(i)))*(int)(Math.pow(2,8-(i+1)));
    }
    return equi;
} 
	
	public static void main(String[] args) 
	{ 
		Scanner obj=new Scanner(System.in);
		String code=obj.next();
		System.out.println(messageFromBinaryCode(code));

	
	} 

} 
