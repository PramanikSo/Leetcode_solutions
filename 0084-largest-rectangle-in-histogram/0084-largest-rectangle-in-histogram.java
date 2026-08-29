class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int []pse=findPSE(heights);
        int []nse=findNSE(heights);
        int maxArea=0;
        for(int i=0;i<n;i++){
            int left=pse[i];
            int right=nse[i];
            int area=heights[i]*(right-left-1);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }

    int []findPSE(int []arr){
        Stack<Integer>stack=new Stack<>();
        int n=arr.length;
        int []pse=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return pse;

    }

    int []findNSE(int []arr){
        Stack<Integer>stack=new Stack<>();
        int n=arr.length;
        int []nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            nse[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return nse;
    }
}