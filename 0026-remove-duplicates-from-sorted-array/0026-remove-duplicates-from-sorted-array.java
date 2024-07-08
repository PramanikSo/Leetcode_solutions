class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[start]){
                nums[++start]=nums[i];
            }
        }
        return start+1;
    }
}