import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Student {
    private String name;
    private LocalDate dob;
    private int age;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.age = calculateAge();
    }

    private int calculateAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dob, today);
        return period.getYears();
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) throws ParseException {
        Student student = new Student("Alice", "15-08-2002");
        student.displayStudentDetails();
    }
}
