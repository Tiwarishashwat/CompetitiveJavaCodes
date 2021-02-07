int rangeBitCount(int L, int R) 
{
   // Initialize the result
    int bitCount = 0;
    for (int i = L; i <= R; i++)
    {
        bitCount += countSetBitsUtil(i);
    }
    // Return the setbit count
    return bitCount;
}
static int countSetBitsUtil(int x)
{
    // Base Case
    if (x <= 0)
        return 0;
 
    // Recursive Call
    return ((x % 2 == 0 ? 0 : 1) + countSetBitsUtil(x / 2));
}