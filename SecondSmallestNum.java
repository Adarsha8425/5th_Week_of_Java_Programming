package WeekFive;

import java.util.Scanner;

public class SecondSmallestNum {
    
    static void printSecondSmallestNumber(int [] array)
    {
        int smallest_num = array[0];
        int second_smallnum = array[1];

        for(int numbers: array)
        {
            if(numbers < smallest_num)
            {
                second_smallnum = smallest_num;
                smallest_num = numbers;
            }
            else if(numbers > smallest_num && numbers < second_smallnum)
            {
                smallest_num = numbers;
            }
        }
        System.out.println("The Second Smallest Number is :" + smallest_num);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array: ");

        int n = sc.nextInt();

        System.out.println("Enter " + n + " Elements");

        int array[] = new int[n];

        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println();
        printSecondSmallestNumber(array);

        sc.close();
    }
}
