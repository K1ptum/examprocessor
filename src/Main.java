
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void inputStudents(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student #" + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter ID of student #" + (i + 1) + ": ");
            String id = scanner.nextLine();

            Student student = new Student(name, id);

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter subject " + (j + 1) + " name: ");
                String subjectName = scanner.nextLine();

                System.out.print("Enter marks for " + subjectName + ": ");
                int marks = scanner.nextInt();
                scanner.nextLine(); // consume newline

                student.addSubject(subjectName, marks);
            }

            student.calculateAverage();
            student.assignGradeAndRecommendation();
            students.add(student);
            System.out.println();
        }
    }

    public static void displayAllReports(ArrayList<Student> students) {
        for (Student student : students) {
            student.displayReport();
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        inputStudents(students);
        displayAllReports(students);
    }
}
