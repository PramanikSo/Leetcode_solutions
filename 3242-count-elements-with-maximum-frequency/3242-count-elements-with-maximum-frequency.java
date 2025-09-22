class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[]=new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int max=0;
        int maxCount=0;
        for(int i=0;i<count.length;i++){
            int currCount=count[i];
            if(max<currCount){
                max=currCount;
                maxCount=0;
                maxCount+=currCount;
            }else if(max==currCount){
                maxCount+=currCount;
            }
        }
        return maxCount;

    }
}