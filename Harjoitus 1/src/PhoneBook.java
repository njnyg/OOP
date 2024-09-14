import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    /**
     * The phonebook has the following structure:
     * phoneBook: {
     * "Key 1" : ["Value 1", "Value 2"],
     * "Key 2" : ["Value 1", "Value 2"]
     * }
     * All entries are of type string.
     **/
    static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);
            int option = takeOption(scan);
            scan.nextLine(); //Flush out enter

            if (option == 1) {

                System.out.print("Nimi: ");
                String name = scan.nextLine();
                getNumber(name);

            } else if (option == 2) {

                System.out.print("Nimi: ");
                String name = scan.nextLine();
                System.out.print("Numero: ");
                String number = scan.nextLine();
                addContactInformation(name, number);
                System.out.println("Ok!");

            } else {
                System.out.println("Lopetetaan...");
                break;
            }
        }
    }

    public static int takeOption(Scanner scan) {

        int option;

        do {

            System.out.print("Komento (1 haku, 2 lisää, 3 lopeta): ");
            option = scan.nextInt();

        } while (option != 1 && option != 2 && option != 3);

        return option;

    }

    public static void getNumber(String name) {

        if (phoneBook.containsKey(name)) {

            ArrayList<String> number = phoneBook.get(name);

            for (int i = 0; i < number.size(); i++) {
                System.out.println(number.get(i));
            }

        } else {
            System.out.println("Ei numeroa");
        }
    }

    public static void addContactInformation(String name, String number) {
        //New entry only if the key already doesn't exist
        phoneBook.putIfAbsent(name, new ArrayList<>());
        //Add number to already existing name
        phoneBook.get(name).add(number);
    }
}
