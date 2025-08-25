class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer>q=new LinkedList<>();
        boolean []visited = new boolean[n];
        q.add(source);
        visited[source]=true;

        while(!q.isEmpty()){
            int pop = q.poll();
            if(pop==destination){
                return true;
            }
            for(int i : adj.get(pop)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return false;
    }
}