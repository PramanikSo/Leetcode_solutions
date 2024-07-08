class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int dp[][]=new int[n][n];

        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=dp[i-1][j];

                int dleft=Integer.MAX_VALUE;
                if(j>0){
                    dleft=dp[i-1][j-1];
                }
                int dright=Integer.MAX_VALUE;
                if(j<n-1){
                    dright=dp[i-1][j+1];
                }

                dp[i][j]=matrix[i][j]+Math.min(up,Math.min(dleft,dright));
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[n-1][i]);
        }


        return min;













        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     min=Math.min(min,helper(n-1,i,matrix,dp));
    
        // }
        // return min;
        
    }
   



    // int helper(int i, int j, int [][]matrix,int [][]dp){
    //     if(j<0 || j>=matrix.length){
    //         return Integer.MAX_VALUE;
    //     }
    //     if(i==0){
    //         return matrix[i][j];
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int up=helper(i-1,j,matrix,dp);
    //     int dleft=helper(i-1,j-1,matrix,dp);
    //     int dright=helper(i-1,j+1,matrix,dp);

    //     return dp[i][j]=matrix[i][j]+Math.min(up,Math.min(dleft,dright));
    // }
}