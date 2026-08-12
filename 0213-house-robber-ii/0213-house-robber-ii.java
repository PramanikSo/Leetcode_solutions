class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)    return nums[0];
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i!=0)    list1.add(nums[i]);
            if(i!=n-1)   list2.add(nums[i]);
        }

        return Math.max(robHelper(list1),robHelper(list2));
    }

    int robHelper(ArrayList<Integer>list){
        int secondPrev=0;
        int prev=list.get(0);

        for(int i=0;i<list.size();i++){
            int take=list.get(i);
            if(i>1){
                take+=secondPrev;
            }
            int notTake=prev;
            int curr=Math.max(take,notTake);
            secondPrev=prev;
            prev=curr;
        }
        return prev;

    }
}