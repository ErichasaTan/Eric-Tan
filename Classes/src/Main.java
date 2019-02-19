import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student eric = new Student("eric", 0);
        ArrayList<Course> courses = new ArrayList<>();
        System.out.println(eric.getFirstName());
        System.out.println(eric.getStudentID());
        System.out.println(eric.courses);

        Student bob = new Student("bob", 1);
        System.out.println(bob.getFirstName());
        System.out.println(bob.getStudentID());
        System.out.println(eric.courses);
    }
}
