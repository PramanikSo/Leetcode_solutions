class Solution {
    public int mySqrt(int x) {
        double epsilon=0.00001;

        double root=x;

        while(Math.abs(root*root-x)>epsilon){
            root=(root+x/root)/2;
        }
        return (int)root;
    }
}