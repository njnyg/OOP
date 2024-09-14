import java.util.Scanner;


public class ArithmeticSequence {

    public static void main(String[] args){

        int maxValue = getMaxValue();
        int numberOfTerms = getNumberOfTerms(maxValue);
        int sumOfTerms = sumAllTerms(maxValue, numberOfTerms);
        int sumOfSquares = sumAllSquares(maxValue);

        printSequence(maxValue);
        printResults(numberOfTerms, sumOfTerms, sumOfSquares);

    }

    public static int getMaxValue() {
        int maxValue;
        Scanner scan = new Scanner(System.in);
        System.out.print("Syötä jonon maksimiarvo: ");

        maxValue = scan.nextInt();

        //The sequence starts from 3, a max value cant be smaller than that
        if (maxValue < 3){
            return 0;
        }

        maxValue = (maxValue / 3) * 3; //Rounding it down to the neares integer divisible by 3

        return maxValue;
    }

    public static void printSequence(int maxValue) {
        System.out.print("Aritmeettinen jono: ");

        for (int i = 3; i < maxValue + 1; i += 3){
            System.out.print(i + ", ");
        }
        System.out.println(" ");
    }

    public static int getNumberOfTerms(int maxValue) {
         return maxValue / 3;
    }

    public static int sumAllTerms(int maxValue, int numberOfTerms) {
        return (numberOfTerms * (3 + maxValue)) / 2;
    }

    public static int sumAllSquares(int maxValue){
        int sumOfSquares = 0;

        for (int i = 3; i < maxValue + 1; i += 3) {
            sumOfSquares += i * i;
        }
        return sumOfSquares;
    }

    public static void printResults(int numberOfTerms, int sumOfTerms, int sumOfSquares) {

        System.out.println("Termien määrä: " + numberOfTerms);
        System.out.println("Termien summa: " + sumOfTerms);
        System.out.println("Termien neliöiden summa: " + sumOfSquares);

    }
}
