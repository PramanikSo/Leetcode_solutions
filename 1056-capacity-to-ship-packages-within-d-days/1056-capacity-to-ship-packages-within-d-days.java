class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        int start=1,end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            int total=0;
            int dayCount=1;
            for(int i=0;i<n;i++){
                if(weights[i]>mid){
                    dayCount=days+1;
                    break;
                }
                if(total+weights[i]>mid){
                    dayCount++;
                    total=weights[i];
                }else{
                    total+=weights[i];
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