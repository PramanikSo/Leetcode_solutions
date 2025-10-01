class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int r=numBottles%numExchange;
            int d=numBottles/numExchange;
            total+=d;
            numBottles=d+r;
        }
        return total;
    }
}