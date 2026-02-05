class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums)-sumSubarrayMins(nums);
    }
    private long sumSubarrayMins(int[] arr) {
        long sum=0;
        int []nse=findNSE(arr);
        int[]pse=findPSE(arr);
        for(int i=0;i<arr.length;i++){
            int left = i - pse[i];
            int right = nse[i]-i;
            long freq = left*right*1L;
            long val =(arr[i]*freq);
            sum=(sum+val);
        }
        return sum;
    }
     private long sumSubarrayMaxs(int[] arr) {
        long sum=0;
        int []nge=findNGE(arr);
        int[]pge=findPGE(arr);
        for(int i=0;i<arr.length;i++){
            int left = i - pge[i];
            int right = nge[i]-i;
            long freq = left*right*1L;
            long val =(arr[i]*freq);
            sum=(sum+val);
        }
        return sum;
    }

       // Function to find indices of Next Smaller Element (NSE)
    private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are greater or equal to current
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            // If stack is empty, NSE doesn't exist → set to n
            ans[i] = !st.isEmpty() ? st.peek() : n;

            // Push current index to stack
            st.push(i);
        }

        // Return NSE indices
        return ans;
    }

    // Function to find indices of Previous Smaller or Equal Element (PSEE)
    private int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array from left to right
        for (int i = 0; i < n; i++) {
            // Pop elements greater than current
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            // If stack is empty, PSEE doesn't exist → set to -1
            ans[i] = !st.isEmpty() ? st.peek() : -1;

            // Push current index to stack
            st.push(i);
        }

        // Return PSEE indices
        return ans;
    }
    private int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are greater or equal to current
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, NSE doesn't exist → set to n
            ans[i] = !st.isEmpty() ? st.peek() : n;

            // Push current index to stack
            st.push(i);
        }

        // Return NSE indices
        return ans;
    }

    // Function to find indices of Previous Smaller or Equal Element (PSEE)
    private int[] findPGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array from left to right
        for (int i = 0; i < n; i++) {
            // Pop elements greater than current
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            // If stack is empty, PSEE doesn't exist → set to -1
            ans[i] = !st.isEmpty() ? st.peek() : -1;

            // Push current index to stack
            st.push(i);
        }

        // Return PSEE indices
        return ans;
    }
}