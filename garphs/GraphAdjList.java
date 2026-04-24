
import java.util.*;

public class GraphAdjList {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    GraphAdjList(int v){
        V=v;
        adj=new ArrayList<>();
        for(int i=0;i<v;i++) adj.add(new ArrayList<>());
    }

    void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void print(){
        for(int i=0;i<V;i++){
            System.out.print(i+" -> ");
            for(int x:adj.get(i)) System.out.print(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        GraphAdjList g=new GraphAdjList(4);
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.print();
    }
}
