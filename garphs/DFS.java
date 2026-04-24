
import java.util.*;

public class DFS {
    static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[v]=true;
        System.out.print(v+" ");
        for(int x:adj.get(v)){
            if(!vis[x]) dfs(x,adj,vis);
        }
    }

    public static void main(String[] args){
        int V=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(2).add(5);

        boolean[] vis=new boolean[V];
        dfs(0,adj,vis);
    }
}
