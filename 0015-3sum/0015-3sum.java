class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<List<Integer>>set=new HashSet<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int rem=-(nums[i]+nums[j]);
                if(map.containsKey(rem)){
                    int ind=map.get(rem);
                    if(ind!=i && ind!=j){
                        List<Integer>list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(rem);
                        Collections.sort(list);
                        set.add(list);
                    }
                    
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(set);
        return ans;
    }
}