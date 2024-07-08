class Solution {
    public int removeDuplicates(int[] nums) {
        int start=1;
        int num=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=num){
                int t=nums[i];
                nums[i]=nums[start];
                nums[start]=t;

                num=nums[start];
                start++;
            }
        }
        return start;
    }
}