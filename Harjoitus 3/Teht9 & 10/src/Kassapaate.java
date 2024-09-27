public class Kassapaate {

    private double rahaa = 100;
    private int edulliset = 0;
    private int maukkaat = 0;

    private double edullinenLounas = 2.95;
    private double maukasLounas = 6.90;

    public Kassapaate() {

    }

    public double syoEdullisesti(double maksu) {
        if (maksu < edullinenLounas) {
            System.out.println("Maksu ei ole riittävä, lounasta ei voi myydä.");
            return 0;
        }

        this.rahaa += edullinenLounas;
        this.edulliset++;
        return maksu - edullinenLounas;
    }

    public double syoMaukkaasti(double maksu) {
        if (maksu  < maukasLounas) {
            System.out.println("Maksu ei ole riittävä, lounasta ei voi myydä.");
            return 0;
        }

        this.rahaa += maukasLounas;
        this.maukkaat++;
        return maksu - maukasLounas;
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.haeSaldo() < edullinenLounas) {
            return false;
        }

        kortti.otaRahaa(edullinenLounas);
        this.edulliset++;
        return true;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.haeSaldo() < maukasLounas) {
            return false;
        }

        kortti.otaRahaa(maukasLounas);
        this.maukkaat++;
        return true;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
        }
    }

    @Override
    public String toString() {
        return "Kassapääte\n" +
                "Rahaa: " + rahaa + "\n" +
                "Edulliset: " + edulliset +
                " Maukkaat: " + maukkaat;
    }
}
