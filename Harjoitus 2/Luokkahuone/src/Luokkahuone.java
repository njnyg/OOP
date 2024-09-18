public class Luokkahuone {

    private String luokanKoodi;
    private int istumapaikat;
    private int varatutPaikat;

    Luokkahuone(String luokanKoodi, int istumapaikat, int varatutPaikat) {
        this.luokanKoodi = luokanKoodi;
        this.istumapaikat = istumapaikat;
        this.varatutPaikat = varatutPaikat;
    }

    public void tulostaLuokkahuone() {
        System.out.println("Luokan koodi: " + luokanKoodi);
        System.out.println("Istumapaikat: " + istumapaikat);
        System.out.println("Varatut paikat: " + varatutPaikat);
    }

    public void varaaPaikka() {
        this.varatutPaikat++;
        System.out.println("Varataan paikkaa...");
    }

    public void tulostaTilanne() {
        int vapaatPaikat = istumapaikat - varatutPaikat;
        System.out.println("Vapaita paikkoja jäljellä: " + vapaatPaikat);
    }
}
