class Solution {
    public boolean doesAliceWin(String s) {
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               return true;
            }
        }
      
        return false;

    }
}
// only possibility of BOB win is when there is no vowel
// if odd number of vowel, alice can pick the whole string
// if even(n) number of vowel then Alice will pick string with (n-1) vowels.For BOB there
// will be one vowel left so BOB lost (12 <- even. Alice will pick 11 vowels and win as there
// is insufficient number of vowel left for BOB for taking even number of vowel)