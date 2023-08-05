import java.util.LinkedList;


public class BFS {
        private int V;

        private LinkedList<Integer>[] adj;

        BFS(int v)
        {
            this.V = v;
            adj = new LinkedList[v];
            for(int i = 0; i < v; ++i)
            {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w)
        {
            adj[v].add(w);
            // 1 2 3 ... v
            // w1
            // w2
            // ...
        }
        void BFSfunction(int RecentVerticle)
        {
            boolean[] visited = new boolean[V];
            
            visited[RecentVerticle] = true;

            // create queue
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(RecentVerticle);

            while(queue.size() != 0)
            {
                
                RecentVerticle = queue.poll(); // i use poll because it doesnt need exception like remove()
                System.out.println("this is my verticle now: " + RecentVerticle + " ");
                java.util.Iterator<Integer> it = adj[RecentVerticle].listIterator();
                while(it.hasNext() == true)
                {
                    int n = it.next(); // luc nay no truy cap tung hang doc
                    if(visited[n] != true)
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
                
        }
        public static void main(String[] args)
        {
            BFS g = new BFS(8);
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
            g.BFSfunction(0);

        }

}
