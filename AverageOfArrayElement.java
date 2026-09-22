package WeekFive;

import java.util.Scanner;

public class AverageOfArrayElement {
    
    int toFindAverageArrayElement(int [] arr)
    {
        int sum = 0;
        for(int i: arr)
        {
            sum += i;
        }
        int average = sum / arr.length;
        return average;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of inputs : ");
        int number = sc.nextInt();

        System.out.print("Enter the Array Elements : ");
        int []arr = new int[number];

        for(int i = 0; i < number; i++)
        {
            arr[i] = sc.nextInt();
        }

        AverageOfArrayElement AE = new AverageOfArrayElement();
        System.out.println("The Average Array Element is " + AE.toFindAverageArrayElement(arr));

        sc.close();
    }
}
