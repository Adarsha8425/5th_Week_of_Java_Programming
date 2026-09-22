package WeekFive;

public class SumOfNumbers {
    
    static int getSumOfNum(int [] arr)
    {
        int sum = 0;
        for(int x: arr)
        {
            sum += x;
        }
        return sum;
    }
    public static void main(String[] agrs)
    {
        int [] arr = {1, 2, 3, 4};
        System.out.println(getSumOfNum(arr));
    }
}
