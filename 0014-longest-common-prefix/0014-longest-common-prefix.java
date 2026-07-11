class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans="";
        int n=strs.length;
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                ans+=strs[0].charAt(i);
            }else{
                break;
            }
        }
        return ans;
    }
}