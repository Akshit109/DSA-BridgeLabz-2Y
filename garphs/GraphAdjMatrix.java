
public class GraphAdjMatrix {
    int[][] mat;
    int V;

    GraphAdjMatrix(int v){
        V=v;
        mat=new int[v][v];
    }

    void addEdge(int u,int v){
        mat[u][v]=1;
        mat[v][u]=1;
    }

    void print(){
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        GraphAdjMatrix g=new GraphAdjMatrix(4);
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.print();
    }
}
