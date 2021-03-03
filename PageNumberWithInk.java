int pagesNumberingWithInk(int current, int numberOfDigits) 
{
    int result=current;
    while(numberOfDigits>0)
    {
        int present=calsize(result);
        numberOfDigits-=present;
        if(numberOfDigits/present==0) break;
        result++;
    }
    return result;
}
public static int calsize(int n)
{
    String str="";
    str+=n;
    System.out.println(n+" "+str.length());
    return str.length();
}
