public class ReverseArray {
    static void Swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reversearr(int[] arr)
    {
        int j = 4;
        int i = 0;
        while(i <= arr.length && j >= 0)
        {
            Swap(i, j, arr);
            i++;
            j--;
        }
        for(int k = 0;k < arr.length; ++k)
        {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {5,4,3,2,1};
        reversearr(arr);
        
    }
}
