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
            int dayCount=0;
            for(int i=0;i<n;i++){
                if(weights[i]>mid){
                    dayCount=days+1;
                    break;
                }
                total+=weights[i];
                if(total>mid){
                    dayCount++;
                    total=weights[i];
                }else if(total==mid){
                     dayCount++;
                     total=0;
                }
            }
            if(total>0){
                dayCount++;
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