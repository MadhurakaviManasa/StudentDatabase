package StudentDatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private static int ID = 1000;
    private String courses = "";
    private String course;
    private static int courseCost = 600;
    private int tuitionBalance = 0;
    private int amount;


    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's first name: ");
        this.firstName = input.nextLine();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the student's last name: ");
        this.lastName = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("GRADE YEARS:\n1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter the student's grade year: ");
        this.gradeYear = input2.nextInt();

        setStudentID();
    }

    // Generate student ID
    private void setStudentID(){
        ID++;
        // StudentID = Grade + ID (constant)
        this.studentID = gradeYear + "" + ID;
    }

    // Enroll courses
    public void enrollCourses(){
        do{
            System.out.print("Enter course name and course code to enroll ('Q' to quit): ");
            Scanner input = new Scanner(System.in);
            course = input.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            }
            else {
                break;
            }
        }while(1 != 0);
    }
    // Pay tuition amount
    public void payTuition(){
        System.out.print("Enter the amount to pay the tuition: $");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        tuitionBalance = tuitionBalance - amount;
    }

    // Show status
    public String toString(){
        return "Student Name: " + firstName + " " + lastName
                + "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses
                + "\nRemaining Balance Due: " + tuitionBalance;
    }


}