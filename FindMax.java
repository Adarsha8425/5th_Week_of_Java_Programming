package WeekFive;

public class FindMax {
    
    static void toFindMAx(int [] arr)
    {
        int max = 0;
        for(int i: arr)
        {
            if(i > max)
            {
                max = i;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        int []arr = {20, 10, 30, 40};
        toFindMAx(arr);
    }
}
