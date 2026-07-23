class Solution {
    public String maxValue(String n, int x) {
        char sign=n.charAt(0);
         StringBuilder ans= new StringBuilder(n);
        if(sign=='-'){
            for(int i=1;i<ans.length();i++){
                char ch=ans.charAt(i);
                if(ch-'0'>x){
                    ans.insert(i,x);
                    return ans.toString();
                }
            }
            ans.append(x);
            return ans.toString();
        }
            
           for(int i=0;i<ans.length();i++){
                char ch=ans.charAt(i);
                if(ch-'0'<x){
                    ans.insert(i,x);
                    return ans.toString();
                }
            }
            ans.append(x);
            return ans.toString();

    }
}