public class Unilelu {

    private String nimi;
    private String lelunTyyppi;
    private int ika;

    public Unilelu(String nimi, String lelunTyyppi, int ika) {
        this.nimi = nimi;
        this.lelunTyyppi = lelunTyyppi;
        this.ika = ika;
    }

    public Unilelu(String nimi) {
        this(nimi, "N/A", 0);

    }

    public Unilelu(String nimi, String lelunTyyppi) {
        this(nimi, lelunTyyppi, 0);
    }

    @Override
    public String toString() {
        return "Nimi: " + nimi + ", Tyyppi: " + lelunTyyppi + ", Ikä: " + ika + " vuotta";
    }
}
