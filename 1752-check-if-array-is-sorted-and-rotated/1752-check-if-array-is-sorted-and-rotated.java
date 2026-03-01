class Solution {
    public boolean check(int[] nums) {
        int count=0;
        boolean ans=true;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                ans=false;
                count++;
            }
        }
        if(!ans && count==1 && nums[n-1]<=nums[0]){
            ans=true;
        }
        return ans;
    }
}