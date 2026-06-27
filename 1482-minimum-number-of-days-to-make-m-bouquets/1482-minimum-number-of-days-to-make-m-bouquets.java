class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;

        if(m*k>n){
            return -1;
        }

        int min=1,max=1;
        for(int i=0;i<n;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        
        int start=min,end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0,ans=0;
            for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid){
                    count++;

                    if(count==k){
                        ans++;
                        count=0;
                    }
                }else{
                    count=0;
                }
            }

            if(ans<m){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return start>max?-1:start;
    }
}