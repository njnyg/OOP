public class Employee {

    private String name;
    private String jobDescription;
    private int employeeId;

    public Employee(String name, String jobDescription, int employeeId) {
        this.name = name;
        this.jobDescription = jobDescription;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Nimi: " + name +
                " Työnkuva: " + jobDescription +
                " ID: " + employeeId;
    }
}
