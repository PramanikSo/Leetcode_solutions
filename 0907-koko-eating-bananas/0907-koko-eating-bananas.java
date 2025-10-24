class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        // int max = 1;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,piles[i]);
        // }
        int start=1,end=1000000000;
        while(start<=end){
            int mid=start+(end-start)/2;
            int hour=0;
            for(int i=0;i<n;i++){
                hour+=Math.ceil((double)piles[i]/mid);
            }
            if(hour<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
        
    }
}