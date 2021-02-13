int leastFactorial(int n) 
{
    int k=1;
    int cal=1;
    while(k<n)
    {
        k=k*cal;
        cal++;
    }
return k;
}
