class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer>map=new HashMap<>();
        
        while(n>0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,0)+1);
            n=n/10;
        }
        int min=Integer.MAX_VALUE;
        int minElem=-1;
        for(Map.Entry<Integer,Integer>elem:map.entrySet()){
            if(elem.getValue()<min){
                min=elem.getValue();
                minElem=elem.getKey();
            }else if(elem.getValue()==min){
                minElem=Math.min(minElem,elem.getKey());
            }
        }
        return minElem;
    }
}