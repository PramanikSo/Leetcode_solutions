class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int start=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                start=Math.max(start,map.get(ch)+1);
            }
            int dist=i-start+1;
            max=Math.max(max,dist);
            map.put(ch,i);
        }
        return max;
    }
}