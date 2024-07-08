class Solution {
    public int singleNumber(int[] nums) {
        
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        return xor;










        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i=i+2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];
    }
}