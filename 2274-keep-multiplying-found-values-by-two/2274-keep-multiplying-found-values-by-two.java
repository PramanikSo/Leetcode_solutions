class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        while(set.contains(original)){
            original=2*original;
        }
        
        return original;
    }
}