package WeekFive;

public class AccessByIndices {
    
    public static void main(String[] args)
    {
        int []marks = {60, 70, 90};

        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.print(marks[2]);

        System.out.println();
        for(int i = marks.length-1; i > 0; i--)
        {

            System.out.println(marks[i]);
        }
    }
}
