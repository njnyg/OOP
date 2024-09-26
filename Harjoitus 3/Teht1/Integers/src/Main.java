public class Main {

    public static void main(String[] args) {

        Integers integerList = new Integers();
        int input;

        while (true) {
            input = integerList.readInteger();
            if (input == -99) {
                break;
            }

            integerList.addIntegers(input);
        }

        int sum = integerList.analyze();
        integerList.calculateAverage(sum);
    }
}
