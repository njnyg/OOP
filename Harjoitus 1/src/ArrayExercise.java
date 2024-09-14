import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// Exercises 2 and 3
public class ArrayExercise {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        int[] randNumbers = new int[10];
        String[] words = new String[10];

        takeInput(numbers, words);
        generateRandom(randNumbers);
        printArray(numbers, randNumbers, words);
        sortArrays(numbers, randNumbers, words);

    }

    public static void takeInput(int[] numbers, String[] words) {
        Scanner read = new Scanner(System.in);
        System.out.println("Syötä lukuja: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = read.nextInt();
        }

        read.nextLine(); //Flush out /n from buffer
        System.out.println("Syötä merkkijonoja: ");

        for (int i = 0; i < 10; i++) {
            words[i] = read.nextLine();
        }
    }

    public static void generateRandom(int[] randNumbers) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            randNumbers[i] = random.nextInt(1000);
        }
    }

    public static void sortArrays(int[] numbers, int[] randNumbers, String[] words) {
        Arrays.sort(numbers);
        Arrays.sort(randNumbers);
        Arrays.sort(words);

        System.out.print("\nJärjestetyt numerot: ");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Järjestetyt merkkijonot: ");
        System.out.println(Arrays.toString(words));

        System.out.print("Järjestetyt satunnaiset numerot: ");
        System.out.println(Arrays.toString(randNumbers));

    }

    public static void printArray(int[] numbers, int[] randNumbers, String[] words) {
        System.out.print("Numerot: ");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Merkkijonot: ");
        System.out.println(Arrays.toString(words));

        System.out.print("Satunnaiset numerot: ");
        System.out.println(Arrays.toString(randNumbers));


    }
}
