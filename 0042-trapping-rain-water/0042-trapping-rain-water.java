class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] prefixSum = new int[n];
        int [] suffixSum = new int[n];
        prefixSum[0]=height[0];
        suffixSum[n-1]=height[n-1];

        for(int i=1;i<n;i++){
            prefixSum[i] = Math.max(height[i], prefixSum[i-1]);
            suffixSum[n-1-i] = Math.max(height[n-1-i],suffixSum[n-i]);
        }
        int total = 0;
        for(int i=0;i<n;i++){
            int leftMax = prefixSum[i];
            int rightMax = suffixSum[i];
            if(height[i]<leftMax && height[i]<suffixSum[i]){
                total += Math.min(leftMax,rightMax) - height[i];
            }
        }
        return total;
    }
}