class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        
        HashSet<List<Integer>>set=new HashSet<>();

        for(int i=0;i<n;i++){
             HashSet<Integer>hset=new HashSet<>();

            for(int j=i+1;j<n;j++){
                int rem=-(nums[i]+nums[j]);
                if(hset.contains(rem)){
                        List<Integer>list=Arrays.asList(nums[i],nums[j],rem);
                        Collections.sort(list);
                        set.add(list);
                }
                hset.add(nums[j]);
            }
        }
        List<List<Integer>>ans=new ArrayList<>(set);
        return ans;
    }
}