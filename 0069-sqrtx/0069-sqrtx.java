class Solution {
    public int mySqrt(int x) {
       //using binary search
       if (x < 2) return x;

        // Initialize binary search range
        int left = 1, right = x / 2, ans = 0;

        // Perform binary search
        while (left <= right) {
            // Find middle point
            long mid = left + (right - left) / 2;

            // Check if mid*mid is less than or equal to x
            if (mid * mid <= x) {
                // Store mid as potential answer
                ans = (int) mid;
                // Move to right half
                left = (int) mid + 1;
            } else {
                // Move to left half
                right = (int) mid - 1;
            }
        }

        // Return final answer
        return ans;
    }
}








// public int mySqrt(int x) {
//         double epsilon = 0.00001;
//         double root = x;

//         while(Math.abs(root*root-x)>epsilon){
//             root=(root + x / root) / 2;
//         }
//         return (int)root;
//     }

// Used Newton's-Ralphson Method 
// Xn+1 = Xn - f(Xn) / f'(Xn)

// For square root of N:  f(X) = X^2 - N
// Using the above formula we get: Xn+1 = ( Xn + N /Xn ) / 2

// We take the value of epsilon = 0.00001 ( We can change accordingly )