class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;

        while(n>=0 && digits[n]==9){
            n--;
        }
        if(n==-1){
            int []ans=new int[digits.length+1];
            ans[0]=1;
            return ans;
        }

        int []ans=new int[digits.length];
        ans[n]=digits[n]+1;
        for(int i=0;i<n;i++){
            ans[i]=digits[i];
        }
        return ans;
    }
}