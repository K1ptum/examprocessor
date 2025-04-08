
import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    String name;
    String id;
    ArrayList<Subject> subjects;
    double averageScore;
    String grade;
    String recommendation;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }

    public void calculateAverage() {
        int total = 0;
        for (Subject s : subjects) {
            total += s.marks;
        }
        this.averageScore = total / (double) subjects.size();
    }

    public void assignGradeAndRecommendation() {
        if (averageScore >= 80) {
            grade = "A";
            recommendation = "Excellent";
        } else if (averageScore >= 70) {
            grade = "B";
            recommendation = "Good";
        } else if (averageScore >= 60) {
            grade = "C";
            recommendation = "Fair";
        } else if (averageScore >= 50) {
            grade = "D";
            recommendation = "Poor";
        } else {
            grade = "F";
            recommendation = "Fail";
        }
    }

    public void displayReport() {
        System.out.println("=========================================");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Subjects and Scores:");
        for (Subject s : subjects) {
            System.out.println("  - " + s.name + ": " + s.marks);
        }
        System.out.printf("Average Score: %.2f\n", averageScore);
        System.out.println("Grade: " + grade);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Report Viewed On: " + LocalDate.now());
        System.out.println("=========================================\n");
    }
}
