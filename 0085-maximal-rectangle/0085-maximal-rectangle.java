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

        // Stack to store indices
        Stack<Integer> stack = new Stack<>();

        // Variable to store max area
        int maxArea = 0;

        // Append a sentinel height
        int[] newHeights = Arrays.copyOf(heights, heights.length + 1);

        // Loop over bars
        for (int i = 0; i < newHeights.length; i++) {

            // While current bar is less than stack top
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {

                // Pop and calculate area
                int height = newHeights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            // Push current index
            stack.push(i);
        }

        return maxArea;
    }


    // public int largestRectangleArea(int[] heights) {
    //     Stack<Integer>stack=new Stack<>();
    //     int n=heights.length;
    //     int maxArea=0;
    //     for(int i=0;i<n;i++){
    //         while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
    //             int elem=heights[stack.pop()];
    //             int pse=stack.isEmpty()?-1:stack.peek();
    //             int area=elem*(i-pse-1);
    //             maxArea=Math.max(maxArea,area);
    //         }
    //         stack.push(i);
    //     }

    //     while(!stack.isEmpty()){
    //             int elem=heights[stack.pop()];
    //             int pse=stack.isEmpty()?-1:stack.peek();
    //             int area=elem*(n-pse-1);
    //             maxArea=Math.max(maxArea,area);
    //     }
    //     return maxArea;
    // }
}