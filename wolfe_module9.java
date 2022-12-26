import java.util.Scanner;

public class wolfe_module9 {
    public static void main(String[] args) {
        int num, max, min, sum = 0; // variables
        float average;
        Scanner s= new Scanner(System.in); // Scanner object
        System.out.print("Enter number of elements in the array: "); // input the number of arrays
        num = s.nextInt();
        int a []= new int[num];
        System.out.print("Enter elements of array:" ); // input the numbers
        for( int i = 0; i< num; i++)
        {
            a[i]= s.nextInt();
            sum = sum + a[i];

        }
        max = a [0]; // the highest number
        for(int i = 0; i< num; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }

        min = a [0]; // lowest number
            for(int i= 0; i< num; i++){
                if(a[i] < min){
                    min = a[i];
                }
            }
        // printing the information
        System.out.println("The Highest Value Entered: " + max);
        System.out.println("The Minimum Value Entered: " + min);
        average = (float) sum / num;
        System.out.println("The Average of the Numbers Entered; " + average);
        System.out.println("The Sum of the Number Entered: " + sum);
    }

}