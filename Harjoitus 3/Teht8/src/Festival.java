import java.util.ArrayList;

public class Festival {

    private String venue;
    private String startDate;
    private String endDate;

    ArrayList<Employee> employees;
    ArrayList<Artist> artists;

    private int numberOfEmployees = 0;
    private int numberOfArtists = 0;

    public Festival(String venue, String startDate, String endDate) {
        this.venue = venue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employees = new ArrayList<Employee>();
        this.artists = new ArrayList<Artist>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        numberOfEmployees++;
    }

    public void addArtist(Artist artist) {
        this.artists.add(artist);
        numberOfArtists++;
    }

    public void removeEmployee(Employee employee) {

        // Tarkistetaan, onko työntekijä listassa
        if (!employees.contains(employee)) {
            System.out.println("Haluttu työntekijä ei ole listassa.");
        } else {
            employees.remove(employee);
            this.numberOfEmployees--;
        }
    }

    public void removeArtist(Artist artist) {

        if (!artists.contains(artist)) {
            System.out.println("Haluttu esiintyjä ei ole listassa.");
        } else {
            artists.remove(artist);
        }
    }

    @Override
    public String toString() {
        return "**** Festarit *** " + "\n" +
                "Tapahtumapaikka: " + venue + '\n' +
                "Aloituspäivä: " + startDate + '\n' +
                "Lopetuspäivä: " + endDate + '\n' +
                "Työntekijät: " + employees + '\n' +
                "Esiintyjät: " + artists + '\n' +
                "Työntekijöiden lukumäärä: " + numberOfEmployees + '\n' +
                "Esiintyjien lukumäärä: " + numberOfArtists + '\n' +
                '}';
    }
}

