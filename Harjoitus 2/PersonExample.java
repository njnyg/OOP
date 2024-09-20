import javax.naming.ldap.PagedResultsControl;

public class PersonExample{

    public static void main(String[] args){

        Person p1 = new Person("Nina", 25);
        System.out.println(p1.getName() + "\t" + p1.getAge() + "\t" + p1.getCount());

        Person p2 = new Person("Erkki", 13);
        System.out.println(p2.getName() + "\t" + p2.getAge() + "\t" + p2.getCount());

        Person p3 = new Person("Matti");
        p3.setName("Teppo");
        p3.setAge(60);
        System.out.println(p3.getName() + "\t" + p3.getAge() + "\t" + p3.getCount());

        Person tiku = new Person("Tiku", 6);
        System.out.println(tiku.toString());


    }

}
