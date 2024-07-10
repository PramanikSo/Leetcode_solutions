class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for(Integer key : map.keySet()){
            if(map.get(key)>(n/3)){
                ans.add(key);
            }
        }
        
        return ans;
    }
}