class Solution {
    public int sumSubarrayMins(int[] arr) {
        int []pse=findPSE(arr);
        int []nse=findNSE(arr);
        int mod=(int)1e9+7;
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            int val=(int)((freq*arr[i])%mod);
            ans=(ans+val)%mod;

        }
        return ans;
    }

    int[] findPSE(int []arr){
        int n=arr.length;
        Stack<Integer>stack=new Stack<>();
        int []pse=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }

            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
     return pse;
    }

    int[] findNSE(int []arr){
        int n=arr.length;
        Stack<Integer>stack=new Stack<>();
        int []nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            nse[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
           
        }
         return nse;
    }

}