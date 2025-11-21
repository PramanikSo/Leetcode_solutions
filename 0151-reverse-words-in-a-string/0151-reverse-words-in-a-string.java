class Solution {
    public String reverseWords(String s) {
       String str[] = s.trim().split("\\s+");

       int start=0;
       int end=str.length-1;
       while(start<end){
         String tempStr = str[start];
         str[start]=str[end];
         str[end]=tempStr;
         start++;
         end--;
       }
       return String.join(" ",str);
    }
}