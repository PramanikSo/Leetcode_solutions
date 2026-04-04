class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;
        for(int i=0;i<n;i++){
            int count[]=new int[256];
            for(int j=i;j<n;j++){
                if(count[s.charAt(j)]==1)   break;
                count[s.charAt(j)]=1;
                int len=j-i+1;
                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
    
}