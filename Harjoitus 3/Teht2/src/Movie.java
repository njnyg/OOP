public class Movie {

    private String name;
    private String director;
    private int year;
    private int ageRating;
    private String genre;

    public Movie(String name, String director, int year, int ageRating, String genre) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.ageRating = ageRating;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNew(Movie movie) {
        if (2024 - year < 5) {
            System.out.println(movie);
        }
    }

    public void printGenre(Movie movie, String input) {
        if (genre.equalsIgnoreCase(input)) {
            System.out.println(movie);
        }
    }

    @Override
    public String toString() {
        return "Name = " + name + ", " +
                "Director = " + director + ", " +
                "Year = " + year + ", " +
                "Age Rating = " + ageRating + ", " +
                "Genre = " + genre +
                "\n";
    }
}
