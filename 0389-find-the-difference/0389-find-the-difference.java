class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        char xor=0;
        for(int i=0;i<n;i++){
            xor^=s.charAt(i);
        }
        for(int i=0;i<=n;i++){
             xor^=t.charAt(i);
        }
        return xor;
    }
}