class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int []ans={-1,-1};
        while(start<=end){
            int mid=start+(end-start);

            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans[0]=mid;
                ans[1]=mid;
                int i=mid;
                while(i>=0 && nums[i]==target){
                    ans[0]=i;
                    i--;
                }
                while(mid<nums.length && nums[mid]==target){
                    ans[1]=mid;
                    mid++;
                }
                return ans;
            }
        }
          return ans;
    }
}