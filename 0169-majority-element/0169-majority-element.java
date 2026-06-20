class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int elem=nums[0];
        for(int i=0;i<nums.length;i++){
            if(elem==nums[i]){
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