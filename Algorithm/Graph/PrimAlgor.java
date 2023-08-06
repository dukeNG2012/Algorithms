public class PrimAlgor {
    static final int V = 5;
    static int MinKey(boolean mstSet[], int key[])
    {
        int min_indx = -1, min = 1000;
        for(int i = 0; i < V; ++i)
        {
            if(mstSet[i] == false && key[i] < min)
            {
                min = key[i];
                min_indx = i;
            }
        }
        return min_indx;
    }
    static void Prim(int graph[][], int src)
    {
        int parent[] = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];

        for (int i = 0; i < V; ++i)
        {
            key[i] = 999;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for(int count = 0; count < V-1; ++count)
        {
            int u = MinKey(mstSet, key);
            mstSet[u] = true;
            for(int v = 0; v < V; ++v)
            {
                if(mstSet[v] == false && graph[u][v] != 0 && key[v] > key[u] + graph[u][v] && key[u] != 999)
                {
                    parent[v] = u;
                    key[v] =graph[u][v];
                }
            }
        }
        print(graph,parent);
    }
    static void print(int graph[][],int parent[])
    {
        for(int i = 1; i < V; ++i)
        {
            System.out.println(parent[i] + " -  " + i + "\t" + graph[i][parent[i]]);
        }
    }
    public static void main(String[] args)
    {
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };
        Prim(graph, 0);
    }
}
