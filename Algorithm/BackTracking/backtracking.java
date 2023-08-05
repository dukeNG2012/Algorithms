public class backtracking
{
    final static int N = 4;
    static boolean isSafe(int[][] matrix, int row, int col)
    {
        for(int i = 0; i < col; ++i)
        {
            if(matrix[row][i]==1)
            {
                return false;
            }
        }

        for(int i = row, j = col; i >=0 && j >=0; --i,--j)
        {
            if(matrix[i][j] == 1)
            {
                return false;
            }
        }

        for(int i = row+1, j = col-1; i < N && j >= 0; i++,j--)
        {
            if(matrix[i][j] == 1)
            {
                return false;
            }
        }
        return true;
    }


    static boolean solveNQueen(int[][] matrix, int col)
    {
        if(col >= N)
        {
            return true;
        }
        for(int i = 0; i < N; ++i)
        {
            if(isSafe(matrix, i, col))
            {
                matrix[i][col] = 1;
                if(solveNQueen(matrix, col+1) == true)
                {
                    return true;
                }
                matrix[i][col] = 0;
            }
        }
        return false;
    }
    static void print(int matrix[][])
    {
        for(int i = 0; i < N; ++i)
        {
            for(int j = 0; j < N; ++j)
            {
                if(matrix[i][j] == 1)
                {
                    System.out.print("Q");
                }
                else
                {
                    System.out.print(".");
                }
                

            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        solveNQueen(matrix, 0);
        print(matrix);
    }
}