int[] weakNumbers(int n) 
{
int weak[]=new int[n];
int div[]=new int[n];
int maxdiv=0,counter=0;
div[0]=d(1);
weak[0]=0;
    for(int i=2;i<=n;i++)
    {
        div[i-1]=d(i);
        weak[i-1]=greaterThanMe(div,div[i-1]);
        if(maxdiv<weak[i-1]) maxdiv=weak[i-1];
    }
    for(int i=0;i<weak.length;i++)
    {
        if(weak[i]==maxdiv) counter++;
    }
    int result[]=new int[2];
    result[0]=maxdiv;
    result[1]=counter;
    return result;
}
public static int d(int n)
    {
    int counter=0;
    for(int i=1;i<=n;i++)
        {
        if(n%i==0) counter++;
        }
    return counter;
    }
public static int greaterThanMe(int div[],int n)
{
    int counter=0;
    for(int i=0;i<div.length;i++)
    {
        if(div[i]>n) counter++;
    }
    return counter;
}