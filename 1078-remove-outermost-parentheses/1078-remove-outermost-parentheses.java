class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' && count++>0){
                    ans.append(ch);
            }else if(ch==')' && count-->1){
                    ans.append(ch);
            }
        }
        return ans.toString();
    }
}