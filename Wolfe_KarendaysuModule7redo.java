// Name: Karendaysu Wolfe
// Date: 12-17-22
// Class: Programming with Java
// Module: 7 (redo)
// Description: A program that a website uses for password requirements (this is my redo for module 12)


import java.util.Scanner;

public class Wolfe_KarendaysuModule7redo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        System.out.println(
                (isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    }

    public static boolean isValidPassword(String password) {
        // Check that the password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check that the password consists of only letters and digits
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Check that the password has at least one uppercase character
        boolean hasUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Check that the password has at least one lowercase character
        boolean hasLowercase = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // If all checks pass, return true
        return true;
    }
}