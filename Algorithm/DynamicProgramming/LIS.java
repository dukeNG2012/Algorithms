
class LIS
{
    static double S(int n)
    {
        if(n == 1)
        {
            return 1/2;
        }
        return 1/(2+S(n-1));
    }
    public static void main(String[] args)
    {
        System.out.println(S(3));
        System.out.println(Math.sqrt(3));
    }
}