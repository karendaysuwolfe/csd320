/*
Name: Karendaysu Wolfe
Date: 11-20-22
Class: Programming with Java
Module: 6
Description: Write a program that uses nested for -
loops to output the following with the shown display format.
 */


public class wolfekarendaysu_module6 {
    public static void main(String[] args) {
        //variable declaration
        int row=8;
        //outer for loop

        //loop for printing space
        for (int j = 1; j <= row-1; j++)
            System.out.print("   ");
        for (int j = 0; j < 1; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("                    @");


        //loop for printing space
        for (int j = 1; j <= row-2; j++)
            System.out.print("   ");
        for (int j = 0; j < 2; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        for (int j = 0; j == 0; j--)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("                 @");


        //loop for printing space
        for (int j = 1; j <= row-3; j++)
            System.out.print("   ");
        for (int j = 0; j < 3; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        for (int j = 3-2; j >= 0; j--)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("              @");


        //loop for printing space
        for (int j = 1; j <= row-4; j++)
            System.out.print("   ");
        for (int j = 0; j < 4; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        for (int j = 4-2; j >= 0; j--)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("           @");


        //loop for printing space
        for (int j = 1; j <= row-5; j++)
            System.out.print("   ");
        for (int j = 0; j < 5; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        for (int j = 5-2; j >= 0; j--)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("        @");


        //loop for printing space
        for (int j = 1; j <= row-6; j++)
            System.out.print("   ");
        for (int j = 0; j < 6; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        for (int j = 6-2; j >= 0; j--)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("     @");


        //loop for printing space
        for (int j = 1; j <= row-7; j++)
            System.out.print("   ");
        for (int j = 0; j < 7; j++)
            System.out.printf("%3d", (int) Math.pow(2,j));
        for (int j = 7-2; j >= 0; j--)
            System.out.printf("%3d", (int) Math.pow(2,j));
        System.out.println("  @");


    }
}