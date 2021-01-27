import java.util.*;
class phoneCall
{
int phoneCall(int min1, int min2_10, int min11, int s) 
{
    int t=1;
    int min=1;
    if(s<min1) return 0;
    s=s-min1;
    while(t<=9 && s>0)
    {
        min=min+1;
        s=s-min2_10;
        t++;
    }
    if(s==0) return min;
    min+=s/min11;
    return min;
}
public static void main(String args[])
{
 Scanner obj = new Scanner(System.in);
 int a=obj.nextInt();
 int b=obj.nextInt();
 int c=obj.nextInt();
 int d=obj.nextInt();
 System.out.println(phoneCall(a,b,c,d));
}
}