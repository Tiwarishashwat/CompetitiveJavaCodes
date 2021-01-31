boolean arithmeticExpression(int a, int b, int c)
{
    if(c==a+b)
    return true;
    else if(c==a-b)
    return true;
    else if(c==a*b)
    return true;
    else if((b!=0)&&(a%b==0))
    {
        if(c==a/b) return true;
    }
    return false;
}
