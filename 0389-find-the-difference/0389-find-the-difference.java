class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int count[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0;i<=n;i++){
            char ch=t.charAt(i);
            count[ch-'a']--;
            if(count[ch-'a']<0){
                return ch;
            }
        }
        return ' ';
    }
}