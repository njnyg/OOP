public class Kassapaate {

    private double rahaa = 100;
    private int edulliset = 0;
    private int maukkaat = 0;

    public Kassapaate() {

    }

    public double syoEdullisesti(double maksu) {
        double edullinenLounas = 2.95;
        if (maksu < edullinenLounas) {
            System.out.println("Maksu ei ole riittävä, lounasta ei voi myydä.");
            return 0;
        }

        this.rahaa += edullinenLounas;
        this.edulliset++;
        return maksu - edullinenLounas;
    }

    public double syoMaukkaasti(double maksu) {
        double maukasLounas = 6.90;
        if (maksu  < maukasLounas) {
            System.out.println("Maksu ei ole riittävä, lounasta ei voi myydä.");
            return 0;
        }

        this.rahaa += maukasLounas;
        this.maukkaat++;
        return maksu - maukasLounas;
    }

    @Override
    public String toString() {
        return "Kassapääte\n" +
                "Rahaa: " + rahaa + "\n" +
                "Edulliset: " + edulliset +
                " Maukkaat: " + maukkaat;
    }
}
