public class Elokuva {

    private String nimi;
    private String genre;
    private int julkaisuvuosi;
    private int ikaraja;

    Elokuva(String nimi, int julkaisuvuosi, String genre, int ikaraja){

        this.nimi = nimi;
        this.genre = genre;
        this.julkaisuvuosi = julkaisuvuosi;
        this.ikaraja = ikaraja;

    }

    public String nimi() {
        return nimi;
    }

    public String getGenre() {
        return genre;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public int getIkaraja() {
        return ikaraja;
    }

    public boolean saakoKatsoa(int ika) {
        return ika >= ikaraja;
    }
}
