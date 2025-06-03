class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for(int num:nums){
            sum*=num;
            sum+=num;
            max=Math.max(max,sum);
        }
        return max;
    }
}