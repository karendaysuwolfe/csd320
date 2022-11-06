import java.util.Scanner;
import java.util.Random;

import static java.lang.System.in;

public class wolfeKarendaysu_module3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Random rand = new Random();

        while(true) {
            System.out.println("\n1.Rock\n2.Paper\n3.Scissors");
            System.out.println("Enter your choice:");
            int userChoice = sc.nextInt();

            String userSelection = "";
            String computerSelection = "";

            if(userChoice == 1) {
                userSelection = "Rock";
            }
            else if(userChoice == 2) {
                userSelection = "Paper";
            }
            else if(userChoice == 3) {
                userSelection = "Scissors";
            }
            else{
                System.out.println("Invalid user choice");
                break;
            }
            int computerChoice = rand.nextInt(3)+1;

            if (computerChoice == 1) {
                computerSelection = "Rock";
            }
            else if(computerChoice == 2) {
                computerSelection = "Paper";
            }
            else if(computerChoice == 3) {
                computerSelection = "Scissors";
            }
            System.out.println("\nUser Choosed " + userSelection);
            System.out.println("Computer Choosed " + computerSelection);

            if(userChoice == computerChoice) {
                System.out.println("\nGame Tie");
                continue;
            }
            else if ((userChoice == 1 && computerChoice == 3)|| (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
                System.out.println("\nCongratulations!! YOU WON"); }
            else {
                System.out.println("Computer Won, Keep trying...");
            }
            char choice;
            System.out.println("\n/Do you want to try again (Y or N): ");
            choice = sc.next(). charAt(0);

            if(choice == 'Y' || choice == 'y') {
                continue;
            }else {
                break;
            }
            }
        }
    }
