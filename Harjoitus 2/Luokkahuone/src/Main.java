public class Main {

    public static void main(String[] args) {
        Luokkahuone luokka1 = new Luokkahuone("B1039", 8, 0);

        luokka1.tulostaLuokkahuone();

        while(!luokka1.taynna()) {
            luokka1.varaaPaikka();
            luokka1.tulostaTilanne();
        }

        if (luokka1.taynna()) {
            System.out.println("Luokka täynnä!");
        }

        luokka1.poistuuPaikalta();
        luokka1.tulostaTilanne();

        luokka1.tulostaLuokkahuone();

    }
}
