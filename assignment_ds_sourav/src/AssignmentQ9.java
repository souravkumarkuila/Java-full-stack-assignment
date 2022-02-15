import java.util.Arrays;
import java.util.Scanner;

class Student {

    public static int studentsTotalMarksInAllSubjects(int student1total, int student2total, int student3total) {
        return student1total+student2total+student3total;
    }
    public static double studentsAverageMarksInAllSubjects(int student1avg, int student2avg, int student3avg) {
        return studentsTotalMarksInAllSubjects( student1avg, student2avg, student3avg)/3;
    }
    public static int subjectATotalByStudents(int[] marks) {
        return Total(marks);
    }
    public static int subjectBTotalByStudents(int[] marks) {
        return Total(marks);
    }
    public static int subjectCTotalByStudents(int[] marks) {
        return Total(marks);
    }
    public static double subjectAAverageByStudents(int[] marks) {
        return (subjectATotalByStudents(marks))/3;
    }
    public static double subjectBAverageByStudents(int[] marks) {
        return (subjectBTotalByStudents(marks))/3;
    }
    public static double subjectCAverageByStudents(int[] marks) {
        return (subjectCTotalByStudents(marks))/3;
    }
    public static int[] MarksEntry() {
        int[] student = new int[4];
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 3) {
            System.out.println("please enter the Student marks for subject "+i );
            int temp = sc.nextInt();
            student[i] = temp;
            i++;
        }
        return student;
    }
    public static int Total(int[] marks){
        int total = 0;
        int i;
        for (i = 0; i < marks.length; i++)
            total += marks[i];
        return total;
    }
}

public class AssignmentQ9 {
    public static int[] SubjectA = new int[4];
    public static int[] SubjectB = new int[4];
    public static int[] SubjectC = new int[4];
    public static int[] student1 = new int[4];
    public static int[] student2 = new int[4];
    public static int[] student3 = new int[4];

    public static void main(String[] args) {
        student1 = Student.MarksEntry();
        student2 = Student.MarksEntry();
        student3 = Student.MarksEntry();
        SubjectA = new int[]{student1[1], student2[1], student3[1]};
        SubjectB = new int[]{student1[2], student2[2], student3[2]};
        SubjectC = new int[]{student1[3], student2[3], student3[3]};
        int SubATotal = (Student.Total(SubjectA));
        int SubBTotal = (Student.Total(SubjectB));
        int SubCTotal = (Student.Total(SubjectC));
        int Student1Total = (Student.Total(student1));
        int Student2Total = (Student.Total(student2));
        int Student3Total = (Student.Total(student3));
        double SubjAAvg = (Student.subjectAAverageByStudents(SubjectA));
        double SubjBAvg = (Student.subjectBAverageByStudents(SubjectB));
        double SubjCAvg = (Student.subjectCAverageByStudents(SubjectC));

        int AllStudentsTotal = (Student.studentsTotalMarksInAllSubjects(Student1Total, Student2Total, Student3Total));
        double AllStudentsAvg = (Student.studentsAverageMarksInAllSubjects(Student1Total, Student2Total, Student3Total));
        System.out.println(AllStudentsTotal);
        System.out.println(AllStudentsAvg);
        System.out.println(SubATotal);
        System.out.println(SubjAAvg);
        System.out.println(SubBTotal);
        System.out.println(SubjBAvg);
        System.out.println(SubCTotal);
        System.out.println(SubjCAvg);

    }
}