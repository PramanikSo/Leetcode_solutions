class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int initialColor=image[sr][sc];
        if(initialColor==color){
            return image;
        }
        Deque<int[]>stack=new ArrayDeque<>();
        stack.push(new int[]{sr,sc});
        image[sr][sc]=color;
        while(!stack.isEmpty()){
            int[] curr=stack.pop();
            int row=curr[0];
            int col=curr[1];
            int [][]directions = {{-1,0},{1,0},{0,-1},{0,1}};

            for(int []d: directions){
                int newRow=row+d[0];
                int newCol=col+d[1];
                if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && image[newRow][newCol]==initialColor){
                image[newRow][newCol]=color;
                stack.push(new int[]{newRow,newCol});
            }

        }

        }
        return image;

    }
}
