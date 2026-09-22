package WeekFive;

import java.util.Scanner;

public class NumberOccursInArr {
    
    int getCountNumberOccurInArray(int[] arr, int num)
    {
        int count = 0;
        for(int i: arr)
        {
            if(i == num)
            {
                count += 1;
            }
            
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number : ");
        int number = sc.nextInt();

        int [] arr = {10, 20, 30, 30, 40, 40, 50, 40, 30, 40, 40};
        
        NumberOccursInArr na = new NumberOccursInArr();
        int result = na.getCountNumberOccurInArray(arr, number);

        System.out.println("The " + number + " occurs in Array " + result + " Times!");

        sc.close();
    }
}
