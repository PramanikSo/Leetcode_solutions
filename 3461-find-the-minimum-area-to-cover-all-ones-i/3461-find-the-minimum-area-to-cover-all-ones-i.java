class Solution {
    public int minimumArea(int[][] grid) {
        int rowFirstOne=Integer.MAX_VALUE,rowLastOne=-1,colFirstOne=Integer.MAX_VALUE,colLastOne=-1;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    rowFirstOne=Math.min(i,rowFirstOne);
                    rowLastOne=Math.max(i,rowLastOne);
                    
                     colFirstOne=Math.min(j,colFirstOne);
                     colLastOne=Math.max(j,colLastOne);
                    
                }
            }
        }
         if(rowLastOne==-1||colLastOne == -1) {
            return 0;
        }

        int x=rowLastOne-rowFirstOne+1;
        int y=colLastOne-colFirstOne+1;
        return x*y;
    }
}