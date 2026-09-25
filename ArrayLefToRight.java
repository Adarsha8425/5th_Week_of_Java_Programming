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
        int left = 0;
        int right = 0;

        int result = arr.length / 2;
        if(arr[result] % 2 == 0)
        {
           left = result - 1;
           right = result;
            while (left >= 0 && right <= arr.length) 
            {
                System.out.print(arr[left] + "-->" + arr[right] + "-->");
                left--;
                right++;
            }
        }
        else
        {
            left = result;
            right = result;

            while (left >= 0 && right <= arr.length) 
            {
                if(left == right)
                {
                    System.out.print(arr[left] + "-->");
                }
                else
                {
                    System.out.print(arr[left] + "-->" + arr[right] + "-->");
                }
                left--;
                right++;
            }
        }
    }

    public static void main(String[] args) 
    {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        // printLeftToRight(arr);
        // System.out.println();

        // printRightToLeft(arr);
        // System.out.println();
        // printFromTowardsLeftToRight(arr);

        // System.out.println();
        printFromCenterTowardEnd(arr);
    }
}
