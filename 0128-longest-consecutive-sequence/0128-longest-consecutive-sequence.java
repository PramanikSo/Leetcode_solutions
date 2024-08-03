class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=1;
        for(int i: nums){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                max=Math.max(max,count);
            }

        }
        return max;
    }
}