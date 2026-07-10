class Solution {
    public boolean isIsomorphic(String s, String t) {
        int countS[]=new int[256];
        int countT[]=new int[256];

        for(int i=0;i<s.length();i++){
            int p=s.charAt(i);
            int q=t.charAt(i);
            if(countS[p]!=countT[q])    return false;
            countS[p]=i+1;
            countT[q]=i+1;
        }
        return true;
    }
}