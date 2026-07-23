class Solution {
    public String maxValue(String n, int x) {
        char sign=n.charAt(0);
        if(sign=='-'){
            return helper1(n,x);
        }
        return helper2(n,x);

    }
    String helper1(String n, int x){
        String ans="-";
        for(int i=1;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch-'0'>x){
                ans+=x;
                ans+=n.substring(i);
                return ans;
            }else{
                ans+=ch;
            }
        }
        return ans+=x;
    }

     String helper2(String n, int x){
        String ans="";
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch-'0'<x){
                ans+=x;
                ans+=n.substring(i);
                return ans;
            }else{
                ans+=ch;
            }
        }
        return ans+=x;
    }
}