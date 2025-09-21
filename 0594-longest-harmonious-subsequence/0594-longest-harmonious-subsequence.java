class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+1)){
                int x=map.get(nums[i]);
                int y=map.get(nums[i]+1);
                ans=Math.max(ans,x+y);
            }
        }
        return ans;
    }
}