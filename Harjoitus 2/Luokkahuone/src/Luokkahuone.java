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
        System.out.println("Luokkahuoneen tiedot: ");
        System.out.print("Tunnus: " + luokanKoodi);
        System.out.print(", Istumapaikkoja: " + istumapaikat);
        System.out.print(", Vapaita paikkoja: " + (istumapaikat - varatutPaikat) + "\n");
    }

    public boolean taynna(){
        return varatutPaikat >= istumapaikat;
    }

    public void varaaPaikka() {
        if (varatutPaikat < istumapaikat) {
            varatutPaikat++;
        }
    }

    public void tulostaTilanne() {
        System.out.println("Paikkoja varattu: " + varatutPaikat);
    }

    public void poistuuPaikalta() {
        if (varatutPaikat > 0) {
            varatutPaikat--;
        }
    }
}
