package WeekFive;

public class DivisibleByThree {
    
    void getDivisibleByThree(int []arr)
    {
        for(int i: arr)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {2, 3, 6, 9, 12, 15, 18, 8, 31, 21, 24, 64};
        
        DivisibleByThree DT = new DivisibleByThree();
        DT.getDivisibleByThree(arr);
    }
}
