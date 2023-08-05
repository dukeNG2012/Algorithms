import java.util.LinkedList;
public class DFS {
    private int V;
    private LinkedList<Integer>[] adj;

    DFS(int v)
    {
        this.V = v;
        adj = new LinkedList[V];
        for(int i = 0; i < v; ++i)
        {
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
    void DFSfunction(int s, boolean[] visited)
    {
        visited[s] = true;
        System.out.print(s + "  ");
            java.util.Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    DFSfunction(n,visited);
                }
            }
    }
    void DFSfunctionReal(int s)
    {
        boolean[] visited = new boolean[V];
        DFSfunction(s, visited);
    }
    public static void main(String args[])
    {
         DFS g = new  DFS(8);
 
            g.addEdge(0, 1);

            g.addEdge(0, 2);

            g.addEdge(1, 2);

            g.addEdge(1, 3);

            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(3, 6);
            g.addEdge(3, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 6);
            g.addEdge(5, 7);
            g.addEdge(6, 7);
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
 
        // Function call
        g.DFSfunctionReal(0);
    }
}
