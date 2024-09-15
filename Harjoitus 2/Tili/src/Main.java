public class Main {

    public static void main(String[] args){

        Tili erkinTili = new Tili("Erkki", "1234-0987", 100.0);
        System.out.println(erkinTili.toString());
        erkinTili.pano(20.0);
        System.out.println("Erkin saldo: " + erkinTili.saldo());
        erkinTili.otto(15.0);
        System.out.println("Erkin saldo: " + erkinTili.saldo());

        Tili matinTili = new Tili("Matti", "9999-9999", 50.0);
        System.out.println("\nMatin saldo: " + matinTili.saldo());
        System.out.println("Matin tililtä nostetaan rahaa...");
        matinTili.otto(10.0);
        System.out.println("Matin saldo: " + matinTili.saldo());
        System.out.println("Matin tilille talletetaan rahaa...");
        matinTili.pano(30.0);
        System.out.println(matinTili.toString());


    }
}
