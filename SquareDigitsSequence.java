int squareDigitsSequence(int a0) 
{
HashSet<Integer> h = new HashSet<Integer>();
int x=a0; 
int counter=1;
while(!h.contains(x))
{
    h.add(x);
    int ans=0;
    while(x!=0)
    {
        ans+=(int)Math.pow(x%10,2);
        x=x/10;
    }
    x=ans;
    counter++;    
}
return counter;
}
