import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInfos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInfo> personalInfos = new ArrayList<>();

        while (true) {
            System.out.println("Etunimi: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Sukunimi: ");
             String surname = scanner.nextLine();

            System.out.println("Ikä: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            PersonalInfo person = new PersonalInfo(firstName, surname, age);
            personalInfos.add(person);
        }

        for (PersonalInfo info : personalInfos) {
            System.out.println(info.getFirstName() + " " + info.getSurname());
            System.out.println(info);
        }
    }
}
