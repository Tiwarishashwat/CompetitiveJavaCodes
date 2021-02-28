  static int hourglassSum(int[][] arr) {
        int r1=0,r2=0,r3=0;
        int cursum=0;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
cursum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            if(sum<cursum)
            {
                sum=cursum;
            }
            }
        }
        return sum;
    }