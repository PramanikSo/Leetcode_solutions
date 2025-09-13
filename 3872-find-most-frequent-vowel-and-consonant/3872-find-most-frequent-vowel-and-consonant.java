class Solution {
    public int maxFreqSum(String s) {
        int []conCount=new int[26];
        int []voCount=new int[26];
        int voMax=0,conMax=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u'){
                voCount[ch-97]++;
                voMax=Math.max(voMax,voCount[ch-97]);
            }else{
                 conCount[ch-97]++;
                 conMax=Math.max(conMax,conCount[ch-97]);
            }
           
        }
       return voMax+conMax;
    }
}