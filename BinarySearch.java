package WeekFive;

public class BinarySearch {
    
    int getBinaryValue(int[] arr, int key)
    {
        int left_index = 0;
        int right_index = arr.length-1;
        
        while(left_index <= right_index)
        {
            int mid_index = left_index + (right_index - left_index) / 2;

            if(arr[mid_index] == key)
            {
                return arr[mid_index];
            }
            else if(arr[mid_index] < key)
            {
                left_index = mid_index + 1;
            }
            else
            {
                right_index = mid_index - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int key = 40;
        BinarySearch bs = new BinarySearch();
        
        int result = bs.getBinaryValue(arr, key);
        System.out.println(result);
    }
}
