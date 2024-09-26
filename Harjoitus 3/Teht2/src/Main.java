import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Movie movie1 = new Movie("Dune: Part Two", "Denis Villeneuve", 2024, 13, "Action");
        Movie movie2 = new Movie("The Lord of the Rings: Fellowship of the Ring", "Peter Jackson", 2001, 13, "Fantasy adventure");
        Movie movie3 = new Movie("Mean Girls", "Mark Waters", 2004, 13, "Teen comedy");
        Movie movie4 = new Movie("The Silence of the Lambs", "Jonathan Demme", 1991, 18, "Psychological thriller");

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        System.out.println(movies.toString());

        System.out.println("Elokuvat, jotka ovat alle 5 vuotta vanhoja: ");
        for (Movie movie : movies) {
            movie.printNew(movie);
        }

        System.out.println("Minkä genren elokuvan haluat tulostaa? ");
        String input = scanner.nextLine();
        for (Movie movie : movies) {
            movie.printGenre(movie, input);
        }
    }
}
