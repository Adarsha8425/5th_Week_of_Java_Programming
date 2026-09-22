package WeekFive;

public class ForEachLoop {
    
    static void traverseArray(int [] arr)
    {
        for (int i : arr) 
        {
            System.out.print(i + " ");   
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4};
        traverseArray(arr);
    }
}
