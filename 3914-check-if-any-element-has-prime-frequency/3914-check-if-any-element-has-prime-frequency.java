class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n=100;
        int []primeList = new int[n+1];
        sieveAlgo(n,primeList);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        for(Map.Entry<Integer,Integer>elem: map.entrySet()){
            if(primeList[elem.getValue()]==1){
                return true;
            }
        }
        return false;
    }
    private void sieveAlgo(int n, int[] primeList) {
        // Initialize all as prime
        Arrays.fill(primeList, 1);
        primeList[0] = 0;
        primeList[1] = 0;

        for (int i = 2; i * i <= n; i++) {
            if (primeList[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    primeList[j] = 0;
                }
            }
        }
    }
}