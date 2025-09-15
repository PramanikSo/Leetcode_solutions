class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[0]){
                count++;
            }
        }
        if(count<nums.length){
            return 1;
        }
        return 0;
    }
}