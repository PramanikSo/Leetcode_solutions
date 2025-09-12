class Solution {
    public boolean doesAliceWin(String s) {
        int count[]=new int[s.length()];
        int vowel=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
                count[i]=vowel;
            }
        }
      
        for(int i=count.length-1;i>=0;i--){
            if(count[i]%2==1){
                return true;
            }
        }
        return false;

    }
}