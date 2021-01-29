class DecreasingNumbers 
{ 
	static int countNonDecreasing(int n) 
	{ 
		int N=n;
		int total=0;
		while(N!=0)
		{
		N=N/10;
		total++;	
		}
		System.out.println(total);
		
		int dp[][] = new int[10][n+1]; 
	
		for (int i = 0; i < 10; i++) 
			dp[i][1] = 1; 
	
		// Fill the table in bottom-up manner 
		for (int digit = 0; digit <= 9; digit++) 
		{ 
			
			for (int len = 2; len <= N; len++) 
			{ 
			
				for (int x = 0; x <= digit; x++) 
					dp[digit][len] += dp[x][len-1]; 
			} 
		} 
	
		int count = 0; 
	
		// There total nondecreasing numbers of length n 
		// wiint be dp[0][n] + dp[1][n] ..+ dp[9][n] 
		for (int i = 0; i < 10; i++) 
		{
		   count += dp[i][n]; 
		}
	
		return count; 
	} 
	public static void main(String args[]) 
	{ 
	int n = 33; 
	System.out.println(countNonDecreasing(n)); 
	} 
}
