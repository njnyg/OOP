package Maksukortti;

public class Main {

    public static void main(String[] args) {

        Maksukortti liisanKortti = new Maksukortti("Liisa", 20);
        Maksukortti nuutinKortti = new Maksukortti("Nuutti", 50);

        liisanKortti.syoMaukkaasti();
        nuutinKortti.syoEdullisesti();

        System.out.println(liisanKortti);
        System.out.println(nuutinKortti);

        liisanKortti.lataaRahaa(10);
        nuutinKortti.syoMaukkaasti();

        System.out.println(liisanKortti);
        System.out.println(nuutinKortti);

        liisanKortti.syoMaukkaasti();
        liisanKortti.syoMaukkaasti();
        nuutinKortti.lataaRahaa(50);

        System.out.println(liisanKortti);
        System.out.println(nuutinKortti);

        liisanKortti.syoMaukkaasti();
        liisanKortti.syoEdullisesti();
        nuutinKortti.syoEdullisesti();

        System.out.println(liisanKortti);
        System.out.println(nuutinKortti);

        nuutinKortti.lataaRahaa(-50);
        liisanKortti.lataaRahaa(10);

        System.out.println(liisanKortti);
        System.out.println(nuutinKortti);

    }
}
