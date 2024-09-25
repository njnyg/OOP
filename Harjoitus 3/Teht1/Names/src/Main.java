public class Main {

    public static void main(String[] args) {

        Name nameList = new Name();
        String input;

        while (true) {
            input = nameList.readName();
            if (input.isEmpty()) {
                break;
            }

            nameList.addNames(input);
        }

        nameList.printSecondName();
    }
}
