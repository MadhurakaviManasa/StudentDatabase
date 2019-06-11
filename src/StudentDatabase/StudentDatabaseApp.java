package StudentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask the user to enter how many students to add to the database
        System.out.println("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n-number of students by asking the name and grade of each student
        for(int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();
            students[n].enrollCourses();
            students[n].payTuition();
        }

        for(int n = 0; n < numberOfStudents; n++){
            System.out.println(students[n].toString());
        }

    }
}
