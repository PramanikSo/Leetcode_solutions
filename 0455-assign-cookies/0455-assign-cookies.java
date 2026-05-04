class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i=g.length-1;
        int j=s.length-1;

        int count=0;

        while(j>=0 && i>=0){
            if(s[j]>=g[i]){
                count++;
                i--;
                j--;
            }else{
                i--;
            }
        }
        return count;
    }
}