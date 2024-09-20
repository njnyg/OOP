package Maksukortti;

public class Maksukortti {

    private String omistaja;
    private double saldo;
    private double edullinenLounas = 2.95;
    private double maukasLounas = 6.95;

    Maksukortti(String omistaja, double saldo) {
        this.omistaja = omistaja;
        this.saldo = saldo;
    }

    public String toString(){
        return "Kortin omistaja: " + omistaja + ", kortilla on saldoa: " + saldo + " euroa.";
    }

    public void syoEdullisesti() {
        if (saldo < edullinenLounas) {
            System.out.println("Edullista lounasta ei voi myydä, kortilla ei ole riittävästi saldoa");
        } else {
            saldo -= edullinenLounas;
        }
    }

    public void syoMaukkaasti() {
        if (saldo < maukasLounas) {
            System.out.println("Maukasta lounasta ei voi myydä, kortilla ei ole riittävästi saldoa.");
        } else {
            saldo -= maukasLounas;
        }
    }

    public void lataaRahaa(int ladattavaSumma) {
        if (ladattavaSumma > 0) {
            saldo += ladattavaSumma;
        }
    }
}

