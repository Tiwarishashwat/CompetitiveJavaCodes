int countBlackCells(int n, int m) {
    return n+m+gcd(n,m)-2;
}
public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
