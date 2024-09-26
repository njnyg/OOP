import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameStats {

    private ArrayList<Game> games;

    public GameStats() {
        this.games = new ArrayList<Game>();
    }

    public void readFile(String file) throws FileNotFoundException {

        Scanner fscanner = new Scanner(new File(file));

        while (fscanner.hasNextLine()) {

            String line = fscanner.nextLine();

            // Parse the file so we can store each game as an object
            String[] column = line.split(", ");
            String home = column[0];
            String away = column[1];
            int scoreHome = Integer.parseInt(column[2]);
            int scoreAway = Integer.parseInt(column[3]);

            games.add(new Game(home, away, scoreHome, scoreAway));
        }

        fscanner.close();
    }

    public void getGameResults(String team) {

        int losses = 0;
        int wins = 0;
        int ties = 0;

        for (Game game : games) {

            String home = game.getHome();
            String away = game.getAway();
            int homeScore = game.getHomeScore();
            int awayScore = game.getAwayScore();

            if (home.equals(team)) {

                if (homeScore > awayScore) {
                    wins++;
                } else if (awayScore > homeScore) {
                    losses++;
                } else {
                    ties++;
                }

            } else if (away.equals(team)) {

                if (homeScore > awayScore) {
                    losses++;
                } else if (awayScore > homeScore) {
                    wins++;
                } else {
                    ties++;
                }

                // Ignore the row if the team didn't play
            } else {
                continue;
            }
        }

        System.out.println("Voitot: " + wins);
        System.out.println("Häviöt: " + losses);
        System.out.println("Tasapelit: " + ties);
    }
}
