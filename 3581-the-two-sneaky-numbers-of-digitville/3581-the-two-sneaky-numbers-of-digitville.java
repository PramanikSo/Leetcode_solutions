class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int []count = new int[100];
       int []ans = new int[2];
       int cnt=0;
       for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
        if(count[nums[i]]==2){
            ans[cnt++]=nums[i];
            if(cnt==2){
                break;
            }
        }
       } 
       return ans;
    }
}