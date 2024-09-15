import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Elokuva chipmunks = new Elokuva("Alvin and the chipmunks", 2007, "comedy", 0);

        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä ikäinen olet?");
        int ika = lukija.nextInt();

        if (chipmunks.saakoKatsoa(ika)) {
            System.out.println("Saat katsoa elokuvan " + chipmunks.nimi());
        } else {
            System.out.println("Et saa katsoa elokuvaa " + chipmunks.nimi());
        }

    }
}
