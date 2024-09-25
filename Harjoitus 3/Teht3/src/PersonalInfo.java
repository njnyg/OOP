public class PersonalInfo {

    private String firstName;
    private String surname;
    private int age;

    public PersonalInfo(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonalInfo {" +
                "firstName = '" + firstName + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                '}';
    }
}
