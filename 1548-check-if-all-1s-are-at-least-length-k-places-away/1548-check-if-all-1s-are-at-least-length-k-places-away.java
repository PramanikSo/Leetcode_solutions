class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(index!=-1 && i-index<k+1){
                   return false;
                }
                index=i;
            }
        }
        return true;
    }
}