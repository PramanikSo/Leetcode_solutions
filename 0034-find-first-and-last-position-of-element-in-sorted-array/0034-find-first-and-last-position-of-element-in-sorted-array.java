class Solution {
    public int[] searchRange(int[] nums, int target) {
       return new int[]{
        lowerBound(nums,target),upperBound(nums,target)
       };
    }

     public int lowerBound(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>=target){
                end=mid-1;;
            }else {
               start=mid+1; 
            }
            
        }
        return ans;
    }

     int upperBound(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }    
            else {
               start=mid+1; 
            }
        }
        return ans;
    }
}