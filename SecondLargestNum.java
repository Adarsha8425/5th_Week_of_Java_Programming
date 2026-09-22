package WeekFive;

public class SecondLargestNum {
    
    int getSecondLargestNumber(int[] arr)
    {
        int max = 0;
        int secMax = 0;

        for(int i: arr)
        {
            if(i > max)
            {
                secMax = max;
                max = i;
            }
        }
        return secMax;
    }
    public static void main(String[] args)
    {
        int arr[] = {90, 20, 10, 60, 50, 80};
        
        SecondLargestNum sl = new SecondLargestNum();
        System.out.println(sl.getSecondLargestNumber(arr));
    }
}
