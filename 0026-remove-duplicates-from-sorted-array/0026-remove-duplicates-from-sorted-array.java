class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int elem = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=elem){
                nums[++index]=nums[i];
                elem = nums[i];
            }
        }
        return ++index;
    }
}