class Solution {
    public boolean check(int[] nums) {
        int rotateCount=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                rotateCount++;
            }
        }
        if(rotateCount==0 || rotateCount==1 && nums[n-1]<=nums[0]){
           return true;
        }
        return false;
    }
}