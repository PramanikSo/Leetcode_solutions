class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        
        int total=numBottles;
        while(numBottles>=numExchange){
            numBottles-=numExchange-1;
            total++;
            numExchange++;
        }
        return total;
        
        
    }
}