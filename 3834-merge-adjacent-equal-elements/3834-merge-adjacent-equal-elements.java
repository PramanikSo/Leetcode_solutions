class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        // Deque<Long>stack=new ArrayDeque<>();
        // ArrayList<Long>ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     long elem=nums[i];
        //     while(!stack.isEmpty() && elem==stack.peek()){
        //         elem=2*stack.pop();
        //     }
        //     stack.push(elem);
        // }
        // while(!stack.isEmpty()){
        //     ans.add(0,stack.pop());
        // }
        // return ans;

        ArrayList<Long>stack=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            long elem=nums[i];
            while(!stack.isEmpty() && stack.get(stack.size()-1)==elem){
                elem=2*stack.remove(stack.size()-1);
            }
            stack.add(elem);
        }
        return stack;
    }
}