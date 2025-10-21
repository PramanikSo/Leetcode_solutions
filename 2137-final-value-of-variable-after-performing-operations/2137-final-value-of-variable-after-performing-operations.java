class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            char ch1=str.charAt(0);
            char ch2=str.charAt(1);
            if(ch1=='-' || ch2=='-'){
                ans--;
            }else{
                ans++;
            }
        }    
        return ans;
    }
}