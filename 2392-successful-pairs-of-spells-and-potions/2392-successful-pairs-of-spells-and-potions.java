class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
           int index=binarySearch(potions,spells[i],success);
           if(index!=-1){
            ans[i]+=m-index;
           }
        }
         return ans;
    }
    private int binarySearch(int[] potions,long st,long success){
        int low=0;
        int high=potions.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)potions[mid]*st >= success){
                index=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }
   
}