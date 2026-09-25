package WeekFive;

public class ArrayLefToRight {
    
    static void printLeftToRight(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if(i != arr.length-1)
            {
                System.out.print("-->");
            }
        }
    }

    static void printRightToLeft(int []arr)
    {
        for(int i = arr.length-1; i >= 0; i--)
        {
            System.out.print(arr[i]);

            if(i != 0)
            {
                System.out.print("-->");
            }
        }
    }

    static void printFromTowardsLeftToRight(int [] arr)
    {
        int left_index = arr[0];
        int right_index = arr[arr.length-1];
        while(left_index <= right_index)
        {
            System.out.print(left_index + "-->" + right_index + "-->");
            left_index++;
            right_index--;
        }
    }

    static void printFromCenterTowardEnd(int [] arr)
    {
        int left_index = 0;
        int right_index = 0;

        if(arr.length % 2 == 0)
        {
           left_index = (arr.length / 2) - 1;
           right_index = arr.length / 2;
            while (left_index >= 0 && right_index <= arr.length) 
            {
                System.out.print(arr[left_index] + "-->" + arr[right_index] + "-->");
                left_index--;
                right_index++;
            }
        }
        else
        {
            left_index = arr.length / 2;
            right_index = arr.length / 2;

            while (left_index >= 0 && right_index <= arr.length) 
            {
                if(left_index == right_index)
                {
                    System.out.print(arr[left_index] + "-->");
                }
                else
                {
                    System.out.print(arr[left_index] + "-->" + arr[right_index] + "-->");
                }
                left_index--;
                right_index++;
            }
        }
    }

    public static void main(String[] args) 
    {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        printLeftToRight(arr);
        System.out.println();

        printRightToLeft(arr);
        System.out.println();
        
        printFromTowardsLeftToRight(arr);
        System.out.println();
        
        printFromCenterTowardEnd(arr);
    }
}
