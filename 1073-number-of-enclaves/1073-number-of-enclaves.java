class Solution {
    public int numEnclaves(int[][] grid) {
        Deque<int[]>q=new ArrayDeque<>();
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(grid[i][j]==1){
                        q.add(new int[]{i,j,1});
                        visited[i][j]=true;
                    }
                }
            }
        }

        while(!q.isEmpty()){
            int []curr=q.poll();
            int row=curr[0];
            int col=curr[1];

            int [][]directions = {{0,1},{0,-1},{1,0},{-1,0}};
            for(int dir[] : directions){
                int newRow = row+dir[0];
                int newCol = col+dir[1];
                if(newRow >=0 && newRow <m && newCol>=0 && newCol<n){
                    if(grid[newRow][newCol]==1 && !visited[newRow][newCol]){
                        q.add(new int []{newRow,newCol,1});
                        visited[newRow][newCol]=true;
                    }
                } 
            }
            
        }
        int count=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(!visited[i][j] && grid[i][j]==1){
                        count++;
                    }
                }
            }
             return count;
    }
}