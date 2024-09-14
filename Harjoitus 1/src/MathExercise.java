import java.util.Scanner;

// Exercises 4, 5 and 6
public class MathExercise {

    static int negativeCount = 0;
    static int evenCount = 0;
    static int sum = 0;

    public static void main(String[] args) {

        takeInput();
        System.out.println("\nNegatiivisten kokonaislukujen määrä: " + negativeCount);
        System.out.println("\nParillisten kokonailukujen määrä: " + evenCount);
        System.out.println("\nKolmella jaollisten positiivisten kokonalislukujen summa: " + sum);

    }

    public static void takeInput() {

        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.print("Syötä kokonaislukuja (syötä 0 poistuaksesi): ");
            input = scan.nextInt();

            // Don't pass the 0 to the methods
            if (input != 0){
                countNegativeInts(input);
                countEvenInts(input);
                sumDivisibleByThree(input);
            }

        } while (input != 0);
    }

    public static void countNegativeInts(int input) {
        if (input < 0){
            negativeCount++;
        }
    }

    public static void countEvenInts(int input) {
        if (input % 2 == 0){
            evenCount++;
        }
    }

    public static void sumDivisibleByThree(int input) {
        if (input % 3 == 0 && input > 0){
            sum += input;
        }
    }

}
