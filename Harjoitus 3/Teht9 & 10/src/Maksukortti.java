public class Maksukortti {

    private double saldo;

    public Maksukortti(int balance) {
        this.saldo = balance;
    }

    public double haeSaldo() {
        return saldo;
    }

    public void lataaRahaa(double summa) {
        this.saldo += summa;
    }

    public void otaRahaa(double summa) {
        this.saldo -= summa;
    }
}
