public class TimeComplexity {
    static void UsingFor(int n)
    {
        int i = 0;
        for(i = 0; i < n; ++i)
        {
            System.out.print("");
        }
    }
    static int UsingRecursion(int n)
    {
        if(n == 1)
        {
            return 0;
        }
        System.out.print("");
        return UsingRecursion(n-1);
    }
    public static void main(String[] args)
    {
        double startTime = System.nanoTime();
        //UsingFor(10000);
        UsingRecursion(10000);
        double endTime   = System.nanoTime();
        double totalTime = endTime - startTime;
        // nano la 10^9
        System.out.println(totalTime/(Math.pow(10, 6)));
    }
}
