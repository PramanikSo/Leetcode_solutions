class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int start=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  zero++;

            while(zero>k){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }
            max=Math.max(i-start+1,max);
        }
        return max;
    }
}