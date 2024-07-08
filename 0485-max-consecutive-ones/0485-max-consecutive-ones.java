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















        // int count=0;
        // int max=0;
        // for(int num:nums){
        //     if(num==1){
        //         count++;
        //         max=Math.max(max,count);
        //     }else{
        //         count=0;
        //     }
        // }
        // return max;
    }
}