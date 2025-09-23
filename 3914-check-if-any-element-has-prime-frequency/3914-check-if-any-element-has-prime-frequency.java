class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n=nums.length;
        int cnt[]=new int[100];
        for(int i=0;i<n;i++){
            cnt[nums[i]%100]+=1;
        }
        for(int i=0;i<100;i++){
            if(cnt[i]<2){
                continue;
            }
            int x=0;
            for(int j=2;j*j<=cnt[i];j++){
                if(cnt[i]%j==0){
                    x++;
                }
            }
            if(x==0){
                return true;
            }
        }
        return false;
    }
}