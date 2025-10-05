class Solution {
    public int myAtoi(String str) {
         if(str == null || str.length()==0){
            return 0;
        }
          long num=0;
        str=str.trim();
        if(str.length()==0){
            return 0;
        }
        int sign=1;
        if(str.charAt(0)=='-'){
            sign=-1;
            str=str.substring(1);
        }else if(str.charAt(0)=='+'){
            str=str.substring(1);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch-'0'<10 && ch-'0'>=0){
                num=num*10+(ch-'0');
                if(num*sign>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }else if(num*sign<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }else{
                break;
            }
        }
        return (int)(sign*num);
    }
}