class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int [][]dp=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(m-1,n-1,obstacleGrid,dp);

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