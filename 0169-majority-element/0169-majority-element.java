class Solution {
    public int majorityElement(int[] nums) {
        int elem=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elem){
                count++;
            }else{
                count--;
                if(count==0){
                    count=1;
                    elem=nums[i];
                }
            }
           
        }
        return elem;
    }
}