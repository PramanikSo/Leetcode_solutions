class Solution {
    public void sortColors(int[] nums) {
        int oneCount=0;
        int zeroCount=0;
        int twoCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  zeroCount++;
            if(nums[i]==1)  oneCount++;
            if(nums[i]==2)  twoCount++;
        }
        for(int i=0;i<nums.length;i++){
            if(zeroCount-->0){
                nums[i]=0;
            }else if(oneCount-->0){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }
    }
}