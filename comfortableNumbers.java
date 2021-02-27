int comfortableNumbers(int L, int R){
    int counter = 0;
    for(int i=L;i<=R;i++)
    {
    int x=caldig(i);
    for(int j=i;j<=i+x;j++)
     {
         if (j==i) continue;
         if(j>=L && j<=R)
         {
             if(i>=j-caldig(j) && i<=j+caldig(j)) counter++;
         }
     }  
    }
    return counter;
}
public static int caldig(int n)
{
    int ans=0;
    while(n!=0)
    {
        ans+=n%10;
        n=n/10;
    }
    return ans;
}
    