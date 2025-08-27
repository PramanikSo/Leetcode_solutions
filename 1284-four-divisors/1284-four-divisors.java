class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=divisorCount(nums[i]);
            if(sum!=-1){
                ans+=sum;
            }
        }
        return ans;
    }
    private int divisorCount(int n){
        int count=0;
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==(n/i)){
                    count++;
                    sum+=i;
                }else{
                    count+=2;
                    sum+=i;
                    sum+=(n/i);
                }
            }
        }
        if(count==4){
            return sum;
        }
        return -1;
    }
}