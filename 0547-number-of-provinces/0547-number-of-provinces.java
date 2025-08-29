class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(j).add(i);
                    adj.get(i).add(j);
                }
                
            }
        }
        int count=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(i,adj,visited);
            }
        }
        return count;

    }

    private void bfs(int node,List<List<Integer>>adj,boolean visited[]){
       Queue<Integer>q=new LinkedList<>();
       q.add(node);
       visited[node]=true;
       while(!q.isEmpty()){
        int pop=q.poll();
        for(int i : adj.get(pop)){
            if(!visited[i]){
                visited[i]=true;
                q.add(i);
            }
        }

       }

    }
}