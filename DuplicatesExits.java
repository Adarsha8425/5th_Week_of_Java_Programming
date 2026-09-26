package WeekFive;

import java.util.Scanner;

public class DuplicatesExits {
    
    static String getDuplicatesAreExits(int[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    return "Duplicates are Exits";
                }
            }
        }
        return "Duplicate are Not Exits";
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array: ");

        int numbers = sc.nextInt();

        System.out.println("Enter " + numbers + " Element : ");

        int array[] = new int[n];

        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        String result = getDuplicatesAreExits(array);
        System.out.println(result);

        sc.close();
    }
}
