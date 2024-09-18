public class Main {

    public static void main(String[] args){

        Lemmikit kissa = new Lemmikit("kissa", 1, "valkoinen", "meow!");
        Lemmikit koira = new Lemmikit("koira", 4, "musta", "hau!");
        Lemmikit lammas = new Lemmikit("lammas", 2, "ruskea", "bäää!");

        kissa.tulostaLemmikki();
        kissa.tervehdi();
    }
}
