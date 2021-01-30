int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) 
{
    int ans=0;
    if(value1>value2)
    {
        if(weight1<=maxW)
        {
        ans+=value1;
        maxW-=weight1;
        }
        if(weight2<=maxW)
        {
        ans+=value2;
        }
    }
    else if(value2>=value1)
    {
        if(weight2<=maxW)
        {
        ans+=value2;
        maxW-=weight2;
        }
        if(weight1<=maxW)
        {
        ans+=value1;
        }
    }
return ans;
}
