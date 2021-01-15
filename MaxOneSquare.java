public class MaxOneSquare 
{ 
	static int largestArea(int samples[][]) 
	{ 
		int i,j; 
		int row = samples.length;		
		int column = samples[0].length;	  
		int S[][] = new int[row][column];
	 
		int max_s, max_i, max_j; 
		for(i = 0; i < row; i++) 
			S[i][0] = samples[i][0]; 
	
		for(j = 0; j < column; j++) 
			S[0][j] = samples[0][j]; 

		for(i = 1; i < row; i++) 
		{ 
			for(j = 1; j < column; j++) 
			{ 
				if(samples[i][j] == 1) 
					S[i][j] = Math.min(S[i][j-1],Math.min(S[i-1][j], S[i-1][j-1])) + 1; 
				else
					S[i][j] = 0; 
			} 
		}	 
		max_s = S[0][0]; max_i = 0; max_j = 0; 
		for(i = 0; i < row; i++) 
		{ 
			for(j = 0; j < column; j++) 
			{ 
				if(max_s < S[i][j]) 
				{ 
					max_s = S[i][j]; 
					max_i = i; 
					max_j = j; 
				}	 
			}				 
		}	 
		return max_s;
	} 
	public static void main(String[] args) 
	{ 
		int M[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}; 
			
		System.out.println(largestArea(M));
/*
		for(i = max_i; i > max_i - max_s; i--) 
		{ 
			for(j = max_j; j > max_j - max_s; j--) 
			{ 
				System.out.print(samples[i][j] + " "); 
			} 
			System.out.println(); 
		} 
		*/ 
	} 

} 
