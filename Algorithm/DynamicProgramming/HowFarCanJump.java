public class HowFarCanJump {

    static void Jump(int[] arr)
    {
        // buoc nhay (value) anh huong den index ();
        int jumps[] = new int[12];
        for (int i = 1; i < arr.length; ++i)
        {
            jumps[i] = Integer.MAX_VALUE;
            for(int j = 0; j < i; ++j)
            {
                
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        Jump(arr);
    }
}
