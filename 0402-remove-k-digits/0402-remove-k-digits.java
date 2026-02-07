class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();
       
       for(int i=0;i<num.length();i++){
        char ch=num.charAt(i);
        while(!stack.isEmpty() && k>0 && stack.peek()>ch){
            stack.pop();
            k--;
        }
        stack.push(ch);
       }
        while(k-->0){
            stack.pop();
        }
        
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.insert(0,stack.pop()+"");
        }
        while(ans.length()!=0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        if(ans.length()==0)   return "0";
        
       return ans.toString();
    }
}