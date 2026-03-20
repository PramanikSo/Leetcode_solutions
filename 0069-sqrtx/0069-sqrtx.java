class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            long product = (long)mid*mid;
            if(product==x){
                return mid;
            }else if(product<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}