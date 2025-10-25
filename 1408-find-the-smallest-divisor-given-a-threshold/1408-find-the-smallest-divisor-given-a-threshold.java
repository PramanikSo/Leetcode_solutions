class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
      int n=nums.length;
      int start=1;
      int end=(int)1e6;
      
      while(start<end){
        int mid=start+(end-start)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            // sum+=(int)Math.ceil((double)nums[i]/mid);
            sum+=(nums[i]+mid-1)/mid;
        }
        if(sum<=threshold){
            end=mid;
        }else{
            start=mid+1;
        }
      }
      return start;
    }
}