public class LCS {
    static int LCSof(String s1, String s2, int m, int n)
    {
        if(m == 0 || n == 0)
        {
            return 0;
        }
        if (s1.charAt(m-1) == s2.charAt(n-1))
        {
            return 1 + LCSof(s1, s2, m-1, n-1);
        }
        return Math.max(LCSof(s1, s2, m-1, n),LCSof(s1, s2, m, n-1)); 
    }
    public static void main(String[] args)
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(LCSof(s1, s2, 6, 7));
    }
}
