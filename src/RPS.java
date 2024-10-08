import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        String playerA;
        String playerB = "";
        String rematch;
        boolean valid = false;
        boolean valid2 = false;
        boolean valid3 = false;


        //collecting inputs for player 1
        do {
            valid = false;
            valid2 = false;
            valid3 = false;
            do {
                System.out.println("Player 1, please enter your move:");
                playerA = scan.nextLine();
                if (playerA.equalsIgnoreCase("p") || playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("s")) {
                    valid = true;
                } else {
                    System.out.println("You inputted an incorrect move. Please retry.");
                }
            } while (!valid);
        do {
            System.out.println("Player 2, please input your move");
            playerB = scan.nextLine();
            if (playerB.equalsIgnoreCase("p") || playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("s")) {
                valid3 = true;
            } else {
                System.out.println("Player 2, you inputted an incorrect move. Please retry.");
            }
        } while (!valid3);
        if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")) {
            System.out.println("It's a tie!");
        } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
            System.out.println("Paper covers rock! Player 2 wins!");
        } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
            System.out.println("Rock breaks scissors! Player 1 wins!");
        } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("r")) {
            System.out.println("Rock breaks scissors! Player 2 wins!");
        } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
            System.out.println("scissors cuts paper! Player 1 wins!");
        } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")) {
            System.out.println("It's a tie!");
        } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")) {
            System.out.println("Paper covers rock! Player 1 wins!");
        } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")) {
            System.out.println("It's a tie!");
        } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("s")) {
            System.out.println("Scissors cuts paper. Player 2 wins!");
        }
        System.out.println("Would you like a rematch? [Y/N]");
        rematch = scan.nextLine();
        if (rematch.equalsIgnoreCase("N")) {
            valid2 = true;
        }

       } while(!valid2);

    }
}