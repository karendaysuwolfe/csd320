// Name: Karendaysu Wolfe
// Date: 11-6-22
// Class: Programming with Java
// Module: 4
// Description: Write a program that prompts a user to enter two strings and then checks the strings entered and reports if either the first string is a substring of the second string, or if the second string is a substring of the first string.


import java.util.Scanner;


public class wolfeKarendaysu_module4 {
    public static void main(String[] args) {
// creating the scanner
        Scanner in = new Scanner(System.in);

// Enter the string 1
        System.out.println("Enter String number 1:");
        String s1 = in.nextLine();
// Enter the string 2
        System.out.println("Enter String number 2: ");
        String s2 = in.nextLine();
// Display output
        if(!s1.contains(s2))
        {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of s1" + s1);
        }
    }
}