class Solution{
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-i-1;j++)
            {
                int temp=matrix[i][j];
                //First Element Shift
                matrix[i][j]=matrix[j][n-1-i];
                 //First Element Shift
                matrix[j][n-1-i]=matrix[n-1-i][n-1-j];
                 //First Element Shift
                matrix[n-1-i][n-1-j]=matrix[n-1-j][i];
                 //First Element Shift
                matrix[n-1-j][i]=temp;
            }
        }
    }
}