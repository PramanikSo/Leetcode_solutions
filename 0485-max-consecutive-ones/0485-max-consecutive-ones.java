class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=0;
            }else{
                sum+=1;
            }
             max=Math.max(sum,max);
        }
        return max;

    }
}