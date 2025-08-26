class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int nodeCount=0;
        for(int i=0;i<edges.length;i++){
            int num1=edges[i][0];
            int num2=edges[i][1];
            // map.put(num1,map.getOrdefault(0,num1)+1);
            // map.put(num2,map.getOrdefault(0,num1)+2);
            if(map.containsKey(num1)){
                map.put(num1,(map.get(num1)+1));
            }else{
                nodeCount++;
                map.put(num1,1);
            }
            if(map.containsKey(num2)){
                map.put(num2,(map.get(num2)+1));
            }else{
                nodeCount++;
                map.put(num2,1);
            }
        }
        for(int i=1;i<=nodeCount;i++){
            if(map.get(i)==nodeCount-1){
                return i;
            }
        }
        return -1;
    }
}