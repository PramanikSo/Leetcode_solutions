class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return nums[n-1]+nums[n-2]-nums[0];

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            // max
            if(max<nums[i]){
                max2=max;
                max=nums[i];
            }
            else if(max2<nums[i]){
                max2=nums[i];
            }
        }
        return max+max2-min;
    }
}