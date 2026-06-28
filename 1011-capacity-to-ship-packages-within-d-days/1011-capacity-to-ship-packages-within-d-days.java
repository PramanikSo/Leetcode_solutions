class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int start=1;
        int end=0;
        for(int i=0;i<n;i++){
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            int sum=0;
            int dayCount=1;
            for(int i=0;i<n;i++){

                if(sum+weights[i]>mid){
                    dayCount++;
                    sum=weights[i];
                }else{
                    sum+=weights[i];
                }
            }
            if(dayCount>days){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}