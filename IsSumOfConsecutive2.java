int isSumOfConsecutive2(int N) 
{
    int count = 0; 
    for (long L = 1; L * (L + 1) < 2 * N; L++) 
    { 
        double a = (1.0 * N-(L * (L + 1)) / 2) / (L + 1); 
        if (a-(int)a == 0.0)  
            count++;         
    } 
    return count; 
}
