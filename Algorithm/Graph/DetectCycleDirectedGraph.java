// A Java Program to detect cycle in a graph
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class DetectCycleDirectedGraph {
	
	private final int V;
    private final List<List<Integer>>adj;
    public DetectCycleDirectedGraph(int v)
    {
        this.V = v;
        adj = new ArrayList<>(V);
        for(int i = 0; i < V; ++i)
        {
            adj.add(new LinkedList<>());
        }
    }
    private void addEdge(int v, int w)
    {
        adj.get(v).add(w);
    }
    private boolean iscycleUtil(int s, boolean[] visited, boolean[] ReStack)
    {
        // vi tri cua cac dieu kien trong recursion la vo cung quan trong!
        if(ReStack[s])
        {
            return true;
        }
        if(visited[s] == true)
        {
            return false;
        }
        
        visited[s] = true;
        ReStack[s] = true;

        List<Integer> Children = adj.get(s);
        for(Integer c : Children)
        {
            if(iscycleUtil(c, visited, ReStack))
            {
                return true;
            }
        }
        ReStack[s] = false;
        return false;
    }
    private boolean isCyclic()
    {
        boolean[] visited = new boolean[V];
        boolean[] ReStack = new boolean[V];
        for(int i = 0; i < V; ++i)
        {
            if(iscycleUtil(i, visited, ReStack))
            {
                return true;
            }
        }
        return false;
    }
	// Driver code
	public static void main(String[] args)
	{
		DetectCycleDirectedGraph graph = new DetectCycleDirectedGraph(6);
		graph.addEdge(0, 1);
		graph.addEdge(2-1, 3-1);
		graph.addEdge(0, 3-1);
		graph.addEdge(0, 4-1);
		graph.addEdge(4-1, 5-1);
		graph.addEdge(5-1, 6-1);
        graph.addEdge(6-1, 4-1);
		
		// Function call
		if(graph.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't "
									+ "contain cycle");
	}
}

// This code is contributed by Sagar Shah.
