class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(i,isConnected,visited);
            }
        }
        return count;

    }

    private void bfs(int node,int[][] isConnected,boolean visited[]){
       Deque<Integer>q=new ArrayDeque<>();
       q.add(node);
       visited[node]=true;
       while(!q.isEmpty()){
        int curr=q.poll();
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[curr][i]==1 && !visited[i]){
                visited[i]=true;
                q.add(i);
            }
        }

       }

    }
}