import java.util.Scanner;
import java.util.Random;

public class Kps {

    public static void main(String[] args) {

        int playerWins = 0;
        int computerWins = 0;

        while (playerWins < 3 && computerWins < 3) {

            char userInput = getInput();
            char computerInput = getComputerChoice();
            printRound(userInput, computerInput);
            int winner = getWinner(userInput, computerInput);

            if (winner == 1){
                playerWins++;
            }
            if (winner == -1){
                computerWins++;
            }

            System.out.println("Tietokone " + computerWins + " Sinä " + playerWins + "\n");
        }

        if (computerWins == 3) {
            System.out.println("Hävisit pelin!");
        } else {
            System.out.println("Voitit pelin!");
        }

    }

    public static char getInput() {

        Scanner scan = new Scanner(System.in);
        char input = ' ';

        do {

            System.out.print("Syötä valintasi (K, P, S): ");
            input = scan.next().toLowerCase().charAt(0);

        } while (input != 'k' && input != 'p' && input != 's');

        return input;
    }

    public static char getComputerChoice() {

        Random random = new Random();
        int randInt = random.nextInt(3);
        char[] options = {'k', 'p', 's'};

        if (randInt == 0){
            System.out.println("Tieokone valitsee kiven.");

        } else if (randInt == 1) {
            System.out.println("Tietokone valitsee paperin.");

        } else {
            System.out.println("Tietokone valisee sakset.");
        }

        return options[randInt];
    }

    public static void printRound(char user, char computer) {

        if ((user == 'k' && computer == 's') || (computer == 'k' && user == 's')){
            System.out.println("Kivi murskaa sakset.");

        } else if ((user == 's' && computer == 'p') || (computer == 's' && user == 'p')) {
            System.out.println("Sakset leikkaavat paperin.");

        } else if (user == computer) {
            System.out.println("Tasapeli!");

        } else {
            System.out.println("Paperi peittää kiven.");
        }
    }

    public static int getWinner(char user, char computer) {

        if (user == computer) {
            return 0;

        } else if ((user == 'k' && computer == 's') || (user == 's' && computer == 'p') || (user == 'p' && computer == 'k')) {
            return 1;

        } else {
            return -1;
        }
    }
}
