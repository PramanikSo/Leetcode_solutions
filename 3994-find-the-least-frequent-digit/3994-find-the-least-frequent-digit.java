class Solution {
    public int getLeastFrequentDigit(int n) {
        int []count=new int[10];
        
        while(n>0){
            int r=n%10;
            count[r]++;
            n=n/10;
        }
        int min=Integer.MAX_VALUE;
        int minElem=-1;
        for(int i=9;i>=0;i--){
            if(count[i]<=min && count[i]!=0){
                min=count[i];
                minElem=i;
            }
        }
        return minElem;
    }
}