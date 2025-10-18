class Solution {
    public int mySqrt(int x) {
        int ans=x;
        for(int i=1;i<x;i++){
            if((long)i*i<=x){
                ans=i;
            }else{
                break;
            }
        }
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