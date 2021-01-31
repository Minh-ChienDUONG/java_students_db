import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCource = 600;
    private static int id = 1000;

    public Student () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name:" );
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Fresher\n2 - Sophomore\n3 - Junion\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + " " + id;
    }

    public void enroll() {
       do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCource;
            } else {
                break;
            }
        } while (1!=0);
        System.out.println("Enrolle in: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    public void payTuition() {
        int payment = 0;
        while(payment < tuitionBalance) {
            System.out.println("Enter your payment: $");
            Scanner in = new Scanner(System.in);
            payment = in.nextInt();
        }
        tuitionBalance = payment - tuitionBalance;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade: " + gradeYear +
                "\nId: " +studentID +
                "\nCourses: " + courses +
                "\nTuition Baalance: " + tuitionBalance;
    }
}
