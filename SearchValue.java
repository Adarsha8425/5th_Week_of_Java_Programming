package WeekFive;

public class SearchValue {
    
    static boolean isValueInTheArray(int[] arr, int key)
    {

        for(int i: arr)
        {
            if(i == key)
            {
                return true;
            }
            break;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[] = {50, 10, 20, 30, 40};

        System.out.println(isValueInTheArray(arr, 30));
        System.out.println(isValueInTheArray(arr, 50));
    }
}
