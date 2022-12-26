// Name: Karendaysu Wolfe
// Date: 11-13-22
// Class: Programming with Java
// Module: 5
// Description: A program that uses a while loop to display the following math operations.

class wolfekarendaysu_module5
{
    static void printSum()
    {
        //start the variable at 0 for the sum of series
        double sum1 = 0.0;
        double sum2 = 0.0;

        //while loop to display given series in the smaller to larger
        System.out.println("\n\nSeries From Smaller To Larger: \n");

        int i = 2;
        //run while loop till 99 to print series
        while (i <= 50)
        {
            //Create the ith term of the series and also to calculate the sum
            sum1 += 1.0 / (2 * i - 1);

            //print series
            System.out.print("1/" + (2 * i - 1));
            if (i < 50)
                System.out.print(" + ");

            //Increment the loop
            i++;
        }

        //print the final sum of series from smaller to larger
        System.out.println("\nSum Of Series : " + sum1);

        //Series from larger to smaller
        System.out.println("\n\nSeries From Larger To Smaller: \n");

        //while loop to display given series in the larger to smaller

        int j = 50;
        //run while loop till first term to print series
        while (j >= 2)
        {
            //generate the ith term of the series and also calculate sum
            sum2 += 1.0 / (2 * j - 1);

            //print series
            System.out.print("1/" + (2 * j - 1));
            if (j > 2)
                System.out.print(" + ");

            //decrement loop counter
            j--;
        }

        // Print the final sum of series from larger to smaller
        System.out.println("\nSum Of Series : " + sum2);
    }

    public static void main(String[] args)
    {
        printSum();
    }
}