public class SubsetSum {
    static int subset(int[] arr, int sum,int lengtharr)
    {
        if(sum < 0)
        {
            return 0;
        }
        if(sum == 0)
        {
            return 1;
        }
        if(lengtharr <= 0)
        {
            return 0;
        }
        return subset(arr,sum - arr[lengtharr-1],lengtharr) + subset(arr,sum,lengtharr-1);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        int sum = 4;
        System.out.println(subset(arr,sum,3));
    }
}
