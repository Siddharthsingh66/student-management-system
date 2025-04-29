import java.util.HashMap;
import java.util.Map;
class StudentCourses {
private Map<String, Integer> courses;
public StudentCourses() {
courses = new HashMap<>();
}
public void addCourse(String course, int marks) {
courses.put(course, marks);
}
public void displayCourses() {
System.out.println("Courses and Marks:");
for (Map.Entry<String, Integer> entry : courses.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
public static void main(String[] args) {
StudentCourses studentCourses = new StudentCourses();
studentCourses.addCourse("Mathematics", 85);
studentCourses.addCourse("Computer Science", 90);
studentCourses.addCourse("Physics", 78);
studentCourses.displayCourses();
}
}