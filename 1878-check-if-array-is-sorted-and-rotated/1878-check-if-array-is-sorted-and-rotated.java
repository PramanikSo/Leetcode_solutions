class Solution {
    public boolean check(int[] nums) {
        boolean ans = true;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                ans=false;
                count++;
            }
        }
        if(!ans && count==1 && nums[nums.length-1]<=nums[0]){
            ans=true;
        }
        return ans;
    }
}