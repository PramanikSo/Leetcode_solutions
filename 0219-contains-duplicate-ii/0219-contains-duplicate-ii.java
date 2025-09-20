class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){ //TC O(nums.length)
            if(map.containsKey(nums[i])){
                    return true;
            }
            map.put(nums[i],i);

            if(map.size()>k){  // SC O(k)
                map.remove(nums[i-k]);
            }
            
        }
        return false;
    }
}