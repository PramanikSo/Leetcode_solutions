class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0,maxLen=0;
        int []count=new int[256];
        Arrays.fill(count,-1);
        while(r<n){
            if(count[s.charAt(r)]>=l){
                l=Math.max(count[s.charAt(r)]+1,l);
            }
            int len=r-l+1;
            maxLen=Math.max(len,maxLen);
            count[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }
}