int magicalWell(int a, int b, int n) {
    int result=0;
    while(n>0)
    {
        result+=a*b;
        a++;
        b++;
        n--;
    }
    return result;
}
