class Solution {
    public int findGCD(int[] nums) {
        int min=1001,max=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }

        return gcd(min,max);
    }

    int gcd(int a, int b){
        while(b!=0){
            int c=b;
            b=a%b;
            a=c;
        }
        return a;
    }
}