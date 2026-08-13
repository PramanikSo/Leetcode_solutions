class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int [][]dp=new int[m][n];

        // for(int i=0;i<m;i++){
        //     Arrays.fill(dp[i],-1);
        // }

        // return helper(m-1,n-1,obstacleGrid,dp);
        return helperIterative(m,n,obstacleGrid,dp);

    }
    int helperIterative(int m, int n, int[][] obstacleGrid,int[][] dp){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>=0 && j>=0 && obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 && j==0 && obstacleGrid[i][j]==0){
                    dp[i][j]=1;
                }else{
                int up=0;
                if(i>0 && obstacleGrid[i-1][j]!=1){
                    up=dp[i-1][j]; 
                }
                int left=0;
                if(j>0 && obstacleGrid[i][j-1]!=1){
                    left=dp[i][j-1];
                }
                dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }

    int helper(int m, int n, int[][] obstacleGrid,int[][] dp){
         if(m<0 || n<0 || obstacleGrid[m][n]==1)  return 0;

        if(m==0 && n==0)    return 1;
       
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int up=helper(m-1,n,obstacleGrid,dp);
        int left=helper(m,n-1,obstacleGrid,dp);
        return dp[m][n]=up+left;
        
    }
}