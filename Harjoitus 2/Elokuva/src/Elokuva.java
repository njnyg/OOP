public class Elokuva {

    private String nimi;
    private int julkaisuvuosi;
    private String genre;
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

    public boolean saakoKatsoa(int ika) {
        return ika >= ikaraja;
    }
}
