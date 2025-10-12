class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int []ans={-1,-1};
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                ans[0]=mid;
                ans[1]=mid;
                int temp=mid;
                while(temp>=0 && nums[temp]==target){
                    ans[0]=temp;
                    temp--;
                }
                while(mid<=end && nums[mid]==target){
                    ans[1]=mid;
                    mid++;
                }
                return ans;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}