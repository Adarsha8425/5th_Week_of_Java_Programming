package WeekFive;

public class CountKeys {
    
    static int countKeys(int key, int...nums)
    {
        int count = 0;
        for(int i: nums)
        {
            if(i == key)
            {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int key = 20;
        System.out.println("The count of " + key + " is : " + countKeys(key, 12, 20, 30, 20, 20, 40, 20));
    }
}
