class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int index=0;
        int []ans=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[index++]=nums1[i++];
            }else{
                ans[index++]=nums2[j++];
            }
        }
        while(i<m){
            ans[index++]=nums1[i++];
        }
        while(j<n){
             ans[index++]=nums2[j++];
        }
        int start=0,end=ans.length-1;
        while(start<=end){
            nums1[start]=ans[start];
            nums1[end]=ans[end];
            start++;
            end--;
        }
        
    }
}