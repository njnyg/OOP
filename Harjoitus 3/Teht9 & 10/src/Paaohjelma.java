public class Paaohjelma {

    public static void main(String[] args) {

        Kassapaate linusJaKisalli = new Kassapaate();

        System.out.println(linusJaKisalli);


        Maksukortti annukanKortti = new Maksukortti(2);


        System.out.println("kortilla rahaa " + annukanKortti.haeSaldo() + " euroa");


        boolean onnistuiko = linusJaKisalli.syoMaukkaasti(annukanKortti);

        System.out.println("riittikö raha: " + onnistuiko);


        linusJaKisalli.lataaRahaaKortille(annukanKortti, 100);


        onnistuiko = linusJaKisalli.syoMaukkaasti(annukanKortti);

        System.out.println("riittikö raha: " + onnistuiko);


        System.out.println("kortilla rahaa " + annukanKortti.haeSaldo() + " euroa");


        System.out.println(linusJaKisalli);

    }

}