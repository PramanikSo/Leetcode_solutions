class Solution {
    public int findJudge(int n, int[][] trust) {
        int adj[][] = new int[n+1][n+1];
        for(int i=0;i<trust.length;i++){
            int num1=trust[i][0];
            int num2=trust[i][1];
            adj[num1][num2]=1;
        }
        int judge=-1;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=n;j++){
                sum+=adj[i][j];
            }
            if(sum==0){
                judge=i;
                break;
            }
        }
        int sum=0;
        if(judge!=-1){
        for(int i=1;i<=n;i++){
            sum+=adj[i][judge];
        }
        if(sum==n-1){
            return judge;
        }
        }
        return -1;
    }
}