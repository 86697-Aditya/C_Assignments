import java.util.Scanner;
public class Q4_grade {

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);

        int []marks=new int[5];
        int total_marks=0;

        System.out.println("enter the marks for 5 subjects ");

        for(int i=0;i<5;i++)
        {
            System.out.println("enter marks of subject" + (i+1));
            marks[i]=scanner.nextInt();
            total_marks=total_marks+marks[i];
        }

    scanner.close();
        String grade;

        if(total_marks>=90)
        {
            grade="Ex";
        }
        else if(total_marks<90 && total_marks>=80)
        {
            grade="A";
        }
        else if(total_marks<80 && total_marks>=70)
        {
            grade="B";
        }
        else if(total_marks<70 && total_marks>=60)
        {
            grade="C";
        }
        else
        {
            grade="F";
        }

        System.out.println("total marks of student are "+ total_marks);
        System.out.println("Grade of student is "+ grade);



    }
    
}
