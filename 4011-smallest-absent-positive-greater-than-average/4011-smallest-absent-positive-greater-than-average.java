class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int total=0,n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            total+=nums[i];
        }
        int avg=(total/n);
        double decAvg=total/n;
        if(avg<0){
             avg=1;
        }
        if(avg-decAvg == 0){  
            avg++;
        }
        while(avg >decAvg && set.contains(avg)){
            avg++;
        }
        return avg;

    }
}