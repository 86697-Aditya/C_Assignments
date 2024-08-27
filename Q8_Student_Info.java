import java.util.Scanner;

class Student
{
    String studentName;
    String rollNo;
    int totalMarks;
    public void readStudentDetails()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of Student :");
        studentName=scanner.nextLine();
        System.out.println("Enter the roll number");
        rollNo=scanner.nextLine();
        System.out.println("Enter total marks of student ");
        totalMarks=scanner.nextInt();
        scanner.close();

    }

    public void displayStudentDetails()
    {
        System.out.println("Student Details: ");
        System.out.println("Name :" + studentName);
        System.out.println("Roll No :" + rollNo);
        System.out.println("total marks "+totalMarks);
    }
}


class Q8_Student_Info
{
    public static void main(String[] args)
    {

        Student student=new Student();

        student.readStudentDetails();

        student.displayStudentDetails();

    }
}