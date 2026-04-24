
import java.util.*;

public class BFS {
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
        Queue<Integer> q=new LinkedList<>();

        vis[0]=true;
        q.add(0);

        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");

            for(int x:adj.get(node)){
                if(!vis[x]){
                    vis[x]=true;
                    q.add(x);
                }
            }
        }
    }
}
