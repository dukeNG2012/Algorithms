class QuickSort
{
    static void swap(int[] arr,int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int arr[], int start,int n)
    {
        int pivot = arr[n];
        
        int i = start-1;
        for(int j = start; j < n; ++j)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
                
            }
        }
        swap(arr,i+1,n);
        return i+1;
    }
    static void Quicksort(int start, int end, int[] arr)
    {
        if(start > end)
        {
            return;
        }
        int pivot = partition(arr, start,end);
        Quicksort(start, pivot-1, arr);
        Quicksort(pivot+1, end, arr);
    }
    static void print(int[] arr, int n)
    {
        for(int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10,80,30,90,40,50,70};
        System.out.println(partition(arr, 1, 6));
        //print(arr,7);
        Quicksort(1, 7-1, arr);
        print(arr,7);
    }
}