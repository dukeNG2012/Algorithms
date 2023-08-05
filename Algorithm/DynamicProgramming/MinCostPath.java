public class MinCostPath {
    static int min(int a, int b, int c)
    {
        int x = a < b ? a:b;
        int y = x < c ? x : c;
        return y;
    }
    static int Path(int[][] cost, int m, int n)
    {
        if(m < 0 || n < 0)
        {
            return Integer.MAX_VALUE;
        }
        if(m == 0 && n == 0)
        {
            return cost[m][n];
        }
        return cost[m][n] + min(Path(cost, m-1, n-1), Path(cost, m-1, n), Path(cost, m, n-1));
    }
    public static void main(String[] args) {
        int[][] cost = {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(cost[i][j]);
                if (j == 2) {
                    System.out.println("");
                }
            }
        }
        System.out.println(Path(cost, 2, 2));
    }
}
