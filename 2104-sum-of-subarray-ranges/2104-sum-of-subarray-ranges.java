class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums)-sumSubarrayMins(nums);
    }

    long sumSubarrayMins(int []nums){
        long sum=0;
        int []pse=findPSE(nums);
        int []nse=findNSE(nums);
        for(int i=0;i<nums.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            long val=freq*nums[i];
            sum+=val;
        }
        return sum;
    }
    long sumSubarrayMaxs(int []nums){
        long sum=0;
        int []pge=findPGE(nums);
        int []nge=findNGE(nums);
        for(int i=0;i<nums.length;i++){
            int left=i-pge[i];
            int right=nge[i]-i;
            long freq=left*right*1L;
            long val=freq*nums[i];
            sum=sum+val;
        }
        return sum;
    }

    int []findPSE(int []nums){
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int []pse=new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return pse;
    }
    int []findNSE(int []nums){
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int []nse=new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            nse[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return nse;
    }

       int []findPGE(int []nums){
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int []pge=new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            pge[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return pge;
    }

        int []findNGE(int []nums){
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int []nge=new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            nge[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return nge;
    }
}