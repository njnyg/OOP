package Lemmikit.src;

public class Lemmikit {

    private String laji;
    private int ika;
    private String vari;
    private String aantely;

    Lemmikit(String laji, int ika, String vari, String aantely) {
        this.laji = laji;
        this.ika = ika;
        this.vari = vari;
        this.aantely = aantely;
    }

    public void tulostaLemmikki() {
        System.out.println("Laji: " + laji);
        System.out.println("Ikä: " + ika);
        System.out.println("Väri: " + vari);
    }

    public void tervehdi() {
        System.out.println(laji + " tervehtii sinua!\n -" + aantely);
    }
}


