import java.util.ArrayList;
import java.util.Scanner;

public class Integers {

    private ArrayList<Integer> integers;
    Scanner scanner = new Scanner(System.in);

    public Integers() {
        this.integers = new ArrayList<>();
    }

    public void addIntegers(Integer integer) {
        this.integers.add(integer);
    }

    public int readInteger() {
        System.out.println("Syötä kokonaisluku: ");
        return scanner.nextInt();
    }

    /* For the purpose of this exercise I chose this approach, since it allows us to do everything while only looping
     over the list once (and im lazy). We only have to display the results to the user, so it doesn't have to be modular.
     If we had to do some additional operations I would probably split this method into smaller peaces. */
    public int analyze() {
        int sum = 0;
        int min = 0;
        int max = 0;

        for(int integer : integers) {
            sum += integer;

            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }

        System.out.println("Summa: " + sum);
        System.out.println("Pienin arvo: " + min);
        System.out.println("Suurin arvo: " + max);

        return sum;
    }

    public void calculateAverage(int sum) {
        float average = (float) sum / integers.size();
        System.out.println("Keskiarvo: " + average);
    }
}
