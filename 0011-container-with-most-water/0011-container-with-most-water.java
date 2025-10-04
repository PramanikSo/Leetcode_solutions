class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int max=Integer.MIN_VALUE;

        while(start<end){
            int dif=end-start;
            int min=Math.min(height[start],height[end]);
            max=Math.max(dif*min,max);

            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}