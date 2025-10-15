class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int min=Integer.MAX_VALUE;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[start]<=nums[end]){ // sorted array
                min=Math.min(min,nums[start]);
                break;
            }
            //left part sorted
            if(nums[start]<=nums[mid]){
                min=Math.min(nums[start],min);
                start=mid+1;
            }
            // right part sorted
            else if(nums[mid]<=nums[end]){
                min=Math.min(nums[mid],min);
                end=mid-1;
            }
        }
        return min;
    }
}