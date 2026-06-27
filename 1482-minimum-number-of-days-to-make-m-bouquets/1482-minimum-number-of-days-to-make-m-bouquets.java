class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;

        if(m*k>n){
            return -1;
        }

        int min=1,max=1;
        for(int i=0;i<n;i++){ //O(n)
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        
        int start=min,end=max;
        while(start<=end){ //O(log(max-min))
            int mid=start+(end-start)/2;
            int count=0,ans=0;
            for(int i=0;i<n;i++){ //O(n)
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

//T(C): O(nlog(max-min))
// max: Maximum element in the array
//min: Minimum element in the array