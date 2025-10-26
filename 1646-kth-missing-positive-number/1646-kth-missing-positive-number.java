class Solution {
    public int findKthPositive(int[] arr, int k) {
       Set<Integer>set=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
       }
        int count=0;
        int i=1;
       while(i<arr[arr.length-1]){
         if(!set.contains(i)){
            count++;
            if(count==k){
                return i;
            }
         }
         i++;
       }
       while(count<=k){
         i++;
        count++;
        if(count==k){
                return i;
        }
       
       }
       return i;
    }
}