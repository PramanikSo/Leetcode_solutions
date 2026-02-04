class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0)  stack.push(asteroids[i]);
            else{
                while(!stack.isEmpty() && stack.peek()>0 && Math.abs(asteroids[i]) > stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty() && Math.abs(asteroids[i]) == stack.peek()){
                    stack.pop();
                }else if((stack.isEmpty() || stack.peek()<0) ){
                    stack.push(asteroids[i]);
                }
            }
        }
        int []ans=new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}