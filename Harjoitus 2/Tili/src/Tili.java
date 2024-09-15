public class Tili {
    private String omistaja;
    private String tilinumero;
    private double saldo;

    public Tili(String omistaja, String tilinumero, double saldo) {
        this.omistaja = omistaja;
        this.tilinumero = tilinumero;
        this.saldo = saldo;
    }

    public void pano(double maara) {
        this.saldo = this.saldo + maara;
    }

    public void otto(double maara) {
        this.saldo = this.saldo - maara;
    }

    public double saldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return this.omistaja + ", tilinumero: " + this.tilinumero + ", saldo: " + this.saldo;
    }
}
