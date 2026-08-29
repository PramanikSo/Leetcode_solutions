class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stack=new Stack<>();
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