class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;

            min=Math.min(min,nums[mid]);
            if(nums[start]<=nums[mid]){
                min=Math.min(min,nums[start]);
                start=mid+1;
            }
            if(nums[mid]<=nums[end]){
                min=Math.min(min,nums[end]);
                end=mid-1;
            }
        }
        return min;
    }
}