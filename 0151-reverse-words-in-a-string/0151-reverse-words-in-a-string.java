class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        String ans ="";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(s.charAt(i-1)!=' '){
                   ans=str+ans;
                   ans=" "+ans;
                }
                str="";
            }else{
                str+=ch;
            }
        }
        ans=str+ans;
        return ans;
    }
}