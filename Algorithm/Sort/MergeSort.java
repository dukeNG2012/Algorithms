public class MergeSort {
    static void Merge(int[] arr, int begin, int end, int mid)
    {
        // mid = begin + (end-begin)/2
        // mid = 0 + (5 - 0)/2 = 2!
        int l_arr_n = mid - begin+1;
        int r_arr_n = end - mid;
        int l_arr[] = new int[l_arr_n];
        int r_arr[] = new int[r_arr_n];
        for(int i = 0; i < l_arr_n; ++i)
        {
            l_arr[i] = arr[begin+i];
        }
        for(int j = 0; j < r_arr_n; ++j)
        {
            r_arr[j] = arr[mid + j+1];
        }
        int i = 0;
        int j = 0;
        int k = begin;
        while(i < l_arr_n && j < r_arr_n)
        {
            if(l_arr[i] <= r_arr[j])
            {
                arr[k] = l_arr[i];
                i++;
            }
            else
            {
                arr[k] = r_arr[j];
                j++;
            }
            k++;
        }
        // dong hom may thang thua
        while(i < l_arr_n)
        {
            arr[k] = l_arr[i];
            i++;
            k++;
        }
        while(j < r_arr_n)
        {
            arr[k] = r_arr[j];
            j++;
            k++;
        }
    }
    static void MergeSort(int[] arr, int begin, int end)
    {
        if(begin >= end)
        {
            return;
        }
        int mid = begin + (end-begin)/2;
        MergeSort(arr, begin, mid);
        MergeSort(arr, mid+1, end);
        Merge(arr, begin, end, mid);
    }
    public static void main(String[] args)
    {
        int[] arr = {38,27,43,10,30};
        MergeSort(arr, 0, 4);
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.print(arr[i] + "  ");
        }
    }
}
