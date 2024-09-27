public class Artist {

    private String name;
    private String genre;

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Nimi: " + name +
                " Genre: " + genre;
    }
}
