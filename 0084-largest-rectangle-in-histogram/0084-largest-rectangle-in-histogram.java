class Solution {
    public int largestRectangleArea(int[] heights) {
        int []nse=findNSE(heights);
        int []pse=findPSE(heights);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            ans=Math.max(ans,area);
        }
        return ans;
    }
    private int[] findNSE(int []heights){
        Stack<Integer>stack=new Stack<>();
        int n=heights.length;
        int []ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }

            ans[i]= stack.isEmpty()? n:stack.peek();
            stack.push(i);
        }
        return ans;
    }
    private int[] findPSE(int []heights){
        Stack<Integer>stack=new Stack<>();
        int n=heights.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                stack.pop();
            }

            ans[i]= stack.isEmpty()? -1:stack.peek();
            stack.push(i);
        }
        return ans;
    }
}