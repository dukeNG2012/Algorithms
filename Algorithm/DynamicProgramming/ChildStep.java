public class ChildStep {
    static int childstep(int n)
    {
        int res[] = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        for(int i = 3; i <= n; ++i)
        {
            res[i] = res[i-1] + res[i-2] + res[i-3];
        }

        return res[n];
    }
    public static void main(String[] args)
    {
        // create array with possible step
        System.out.println(childstep(10000));

    }
}
