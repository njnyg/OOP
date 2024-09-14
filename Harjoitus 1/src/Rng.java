import java.util.Random;

public class Rng {

    public static void main(String[] args) {
        int randInt = generateRandomNumber();
        printNumber(randInt);
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        int range = 6 - 1 + 1; // range = max - min + 1;

        return random.nextInt(range) + 1;
    }

    public static void printNumber(int randInt) {
        System.out.println("Satunnainen luku on: " + randInt);
    }
}
