// Name: Karendaysu Wolfe
// Date: 10-27-22
// Class: Programming with Java
// Module: 2
// Description: Write a program that calculates the energy needed tp heat water.


import java.util.Scanner;

public class wolfekarendaysu_module2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Enter watermass which is going to be in kilograms
        System.out.println("Enter water in Kg: ");
        int water= sc.nextInt();

        // Enter the final temperature
        System.out.print("Enter final temperature in Celsius: ");
        int finalTemp= sc.nextInt();

        // Enter the initial temperature
        System.out.print("Enter initial temperature in Celsius: ");
        int initialTemp= sc.nextInt();



        // Q is the results in Joules
        int q = water*(finalTemp - initialTemp) * 4184;

        System.out.println("The total energy is: "+q+" Joules.");
    }
}