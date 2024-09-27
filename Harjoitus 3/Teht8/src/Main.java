public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Pekka", "Liikenteenohjaaja", 1234);
        Employee emp2 = new Employee("Päivi", "Järjestyksenvalvoja", 1112);
        Employee emp3 = new Employee("Mikko", "Baarimikko", 2233);

        Artist artist1 = new Artist("DJ Big", "Acid house");
        Artist artist2 = new Artist("Jonna J", "Hyperpop");
        Artist artist3 = new Artist("Wild child", "Hardstyle");

        Festival festival = new Festival("Kupittaanpuisto", "12.8.2025", "16.8.2025");

        festival.addEmployee(emp1);
        festival.addEmployee(emp2);
        festival.addEmployee(emp3);

        festival.addArtist(artist1);
        festival.addArtist(artist2);
        festival.addArtist(artist3);

        System.out.println(festival);

        festival.removeEmployee(emp1);
        festival.removeArtist(artist3);

        System.out.println(festival);
    }
}
