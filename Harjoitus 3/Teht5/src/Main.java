import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Unilelu> unilelut = new ArrayList<>();

        Unilelu lelu1 = new Unilelu("Erkki", "Kissa", 3);
        Unilelu lelu2 = new Unilelu("Matti");
        Unilelu lelu3 = new Unilelu("Hertta", "Koira");

        unilelut.add(lelu1);
        unilelut.add(lelu2);
        unilelut.add(lelu3);

        for (Unilelu unilelu : unilelut) {
            System.out.println(unilelu);
        }
    }
}