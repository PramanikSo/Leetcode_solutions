class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int initialColor=image[sr][sc];
        if(initialColor==color){
            return image;
        }
        Stack<Pair>stack=new Stack<>();
        stack.push(new Pair(sr,sc));
        image[sr][sc]=color;
        while(!stack.isEmpty()){
            Pair curr=stack.pop();
            int row=curr.row;
            int col=curr.col;
            if(row-1>=0 && image[row-1][col]==initialColor){
                image[row-1][col]=color;
                stack.push(new Pair(row-1,col));
            }if(row+1<m && image[row+1][col]==initialColor){
                image[row+1][col]=color;
                stack.push(new Pair(row+1,col));
            }if(col-1>=0 && image[row][col-1]==initialColor){
                image[row][col-1]=color;
                stack.push(new Pair(row,col-1));
            }if(col+1<n && image[row][col+1]==initialColor){
                image[row][col+1]=color;
                stack.push(new Pair(row,col+1));
            }

        }
        return image;

    }
}

class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}