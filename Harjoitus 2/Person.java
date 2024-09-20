public class Person{
    //instance variable ~ ominaisuudet
    //luokan kaikki instanssiominaisuudet pitäisi olla private
    private String name;
    private int age;

    //leimataan muuttuja luokan muuttujaksi, eikä olion muuttujaksi
    private static int count;

    //costructor ~ rakentaja
    Person(String name, int age){
        this.name = name;
        this.age = age;
        Person.count++;
    }

    Person(String name){
        this.name = name;
        this.age = 0;
        Person.count++;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
