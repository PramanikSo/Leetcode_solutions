class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
      int max=1;
      for(int i=0;i<n;i++){
        max=Math.max(max,nums[i]);
      } 
      int start=1;
      int end=max;
      while(start<=end){
        int mid=start+(end-start)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(int)Math.ceil((double)nums[i]/mid);
        }
        if(sum<=threshold){
            end=mid-1;
        }else{
            start=mid+1;
        }
      }
      return start;
    }
}