class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int a[]=new int[n];
         int MOD=1000000007;
        Arrays.fill(a,1);
       for (int j=0;j<k;j++) {
            int[]x=new int[n];
            x[0]=a[0];
            for(int i=1;i<n;i++) {
                x[i]=(x[i-1]+a[i]) % MOD;
            }
            a=x;
        }
        
        return a[n-1];
    }

}