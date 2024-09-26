import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        GameStats games = new GameStats();
        String path = "D:\\.Home\\Koulu\\OOP\\Code\\Harjoitus 3\\Teht4\\src\\Football_statistics.txt";

        System.out.println("Haettavan joukkueen nimi: ");
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();

        games.readFile(path);
        games.getGameResults(team);
    }
}
