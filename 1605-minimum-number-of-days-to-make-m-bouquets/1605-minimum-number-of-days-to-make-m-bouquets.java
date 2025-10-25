class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n)   return -1;
        int max=1;
        for(int i=0;i<n;i++){
            max=Math.max(max,bloomDay[i]);
        }
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;

            int ind=0;
            int count=0,ans=0;
            while(ind<n){
                if(bloomDay[ind]<=mid){
                    count++;
                    if(count==k){
                        ans++;
                        count=0;
                    }
                }else{
                    count=0;
                }
                ind++;
            }
            if(ans<m){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start>max? -1 :start;
    }
}