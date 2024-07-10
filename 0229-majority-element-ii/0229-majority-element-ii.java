class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        List<Integer>ans=new ArrayList<>();
        int num=nums[0];
        int count=0;
        int target=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                count++;
            }else{
                if(count>target){
                    ans.add(num);
                }
                num=nums[i];
                count=1;
                
            }  
        }
         if(count>target){
            ans.add(num);
        }
        return ans;
    }
}