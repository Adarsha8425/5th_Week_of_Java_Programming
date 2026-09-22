package WeekFive;

public class CountWholeNum {
    
    void ToCountPosNegAndZeros(int [] arr)
    {
        int countPositiveNumber = 0;
        int countNegitiveNumber = 0;
        int countZeros = 0;

        for(int i: arr)
        {
            if(i > 0)
            {
                countPositiveNumber += 1;
            }
            else if(i < 0)
            {
                countNegitiveNumber += 1;
            }
            else 
            {
                countZeros += 1;
            }
        }
        System.out.println("The Positive Numbers are : " + countPositiveNumber);
        System.out.println("The Negitive Numbers are : " + countNegitiveNumber);
        System.out.println("The Zero Numbers are : " + countZeros);
    }
    public static void main(String[] args)
    {
        int []arr = {2, -4, 0, 18, -21, 0, 19, 0, -2, 0, -12, 31, -91, 0, 3, 8, -23, 0, 23, 1, 3, 4, -2, -3};

        CountWholeNum cn = new CountWholeNum();
        cn.ToCountPosNegAndZeros(arr);
    }
}
