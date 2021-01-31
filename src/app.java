import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("Enter number of new students to enroll:" );
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i = 0; i < numOfStudents; i++) {
            Student st = new Student();
            st.enroll();
            st.payTuition();
            students[i] = st;
            System.out.println(st.toString());
        }
    }
}
