public class TestStatic {
   
    
    public static int powerSum(double X, int N,int n, int[]arr) {
    // Write your code here
        
        if(X < 0)
        {
            return 0;
        }
        if(X == 0)
        {
            return 1;
        }
        if(n <= 0)
        {
            return 0;
        }
        
        
        return powerSum(X-Math.pow(arr[n-1],N),N,n,arr) + powerSum(X,N,n-1,arr);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        System.out.println(powerSum(100,2,n, arr));
        System.out.println(arr.length);
        
    }
}
