import java.util.Scanner;

public class Game {

    private String home;
    private String away;
    private int homeScore;
    private int awayScore;

    public Game(String home, String away, int homeScore, int awayScore) {
        this.home = home;
        this.away = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHome() {
        return home;
    }

    public String getAway() {
        return away;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }
/*
    public String readTeam() {
        System.out.println("Joukkueen nimi: ");
        Scanner scanner = new Scanner(System.in);
        this.team = scanner.nextLine();
        return team;
    }*/

}
