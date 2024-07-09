class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][0]=triangle.get(0).get(0);

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i){
                    int up=dp[i-1][j];
                    int dleft=Integer.MAX_VALUE;
                    if(j>0){
                        dleft=dp[i-1][j-1];
                    }
                    dp[i][j]=triangle.get(i).get(j)+Math.min(up,dleft);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}