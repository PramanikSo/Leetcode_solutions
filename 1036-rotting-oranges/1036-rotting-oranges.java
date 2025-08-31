class Solution {
    public int orangesRotting(int[][] grid) {
        int totalCount=0;
        int timeTaken=0;
        int rottenCount=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<Triplet>q=new LinkedList<>();
        int [][]visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Triplet(i,j,0));
                    totalCount++;
                    rottenCount++;
                    visited[i][j]=2;
                    
                }else if(grid[i][j]==1){
                    totalCount++;
                }
            }
        }
        int time=0;
        while(!q.isEmpty()){
            Triplet curr = q.poll();
            int i=curr.row;
            int j=curr.col;
            time=curr.time;
            if(i-1>=0 && grid[i-1][j]==1 && visited[i-1][j]==0){
                // grid[i-1][j]=2;
                q.add(new Triplet(i-1,j,time+1));
                visited[i-1][j]=2;
                rottenCount++;
            }if(j-1>=0 && grid[i][j-1]==1 && visited[i][j-1]==0){
                // grid[i][j-1]=2;
                q.add(new Triplet(i,j-1,time+1));
                visited[i][j-1]=2;
                rottenCount++;
            }
            if(i+1<m && grid[i+1][j]==1 && visited[i+1][j]==0){
                // grid[i+1][j]=2;
                q.add(new Triplet(i+1,j,time+1));
                visited[i+1][j]=2;
                rottenCount++;
            }if(j+1<n && grid[i][j+1]==1 && visited[i][j+1]==0){
                // grid[i][j+1]=2;
                q.add(new Triplet(i,j+1,time+1));
                visited[i][j+1]=2;
                rottenCount++;
            }

        }
        if(totalCount!=rottenCount) return -1;
        return time;
    }
}
class Triplet{
    int row;
    int col;
    int time;
    Triplet(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
