class Solution {
    public int numberOfChild(int n, int k) {
        int curr=0;
        boolean f=true;
        for(int i=1;i<=k;i++){
            if(curr==n-1){
                f=false;
            }if(curr==0){
                f=true;
            }
            if(!f){
                curr--;
            }else{
                curr++;
            }
        }
        return curr;
    }
}