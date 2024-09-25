import java.util.ArrayList;
import java.util.Scanner;

public class Name {

    private ArrayList<String> names;
    Scanner scanner = new Scanner(System.in);

    public Name() {
        this.names = new ArrayList<>();
    }

    public void addNames(String name) {
        this.names.add(name);
    }

    public String readName() {
        System.out.println("Syötä nimi: ");
        String input = scanner.nextLine();
        return input;
        
    }

    public void printSecondName() {
        System.out.println("Listan toinen nimi: ");
        System.out.println(names.get(1));
    }
}
