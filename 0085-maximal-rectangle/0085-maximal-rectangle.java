class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int []heights=new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1') heights[j]++;
                else    heights[j]=0;
            }
            int area=largestRectangleArea(heights);
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }

    

    public int largestRectangleArea(int[] heights) {
        Deque<Integer>stack=new ArrayDeque<>();
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                int elem=heights[stack.pop()];
                int pse=stack.isEmpty()?-1:stack.peek();
                int area=elem*(i-pse-1);
                maxArea=Math.max(maxArea,area);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
                int elem=heights[stack.pop()];
                int pse=stack.isEmpty()?-1:stack.peek();
                int area=elem*(n-pse-1);
                maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}