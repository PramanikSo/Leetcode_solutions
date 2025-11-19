class Solution {
    public int findFinalValue(int[] nums, int original) {
       boolean count[] = new boolean[1001];
       for(int i : nums){
        count[i]=true;
       }

       while(original<1001 && count[original]){
        original <<= 1;
       }
       return original;
    }
}