class Dijkstra
{
	static int V = 9;
	static int minDistance(int[] dist, boolean[] visited)
	{
		int min_idx = -1, min_value = Integer.MAX_VALUE;
		for(int i = 0; i < V; ++i)
		{
			if(visited[i] != true && min_value >= dist[i])
			{
				min_value = dist[i];
				min_idx = i;
			}

		}
		return min_idx;
	}
	static void dijkstra(int[][] graph, int src)
	{
		int dist[] = new int[V];
		boolean visited[] = new boolean[V];
		for(int i = 0; i < V; ++i)
		{
			dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		dist[src] = 0;
		for(int edge = 0; edge < V-1; ++edge)
		{
			int u = minDistance(dist, visited);
			visited[u] = true;
			
			for(int v = 0; v < V; ++v)
			{
				if(visited[v] != true && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
				{
					dist[v] = dist[u] + graph[u][v];
				}
			}
		}
		print(dist);
	}
	static void print(int dist[])
	{
		for(int i = 0; i < V; ++i)
		{
			System.out.println("Verticle: " + i + "          " + dist[i]);
		}
	}
	public static void main(String[] args)
	{
		int graph[][]
            = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		dijkstra(graph,0);
	}
}