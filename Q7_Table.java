import java.util.Scanner;
public class Q7_Table {

    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=scanner.nextInt();
        scanner.close();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+ " * "+i+" "+" = "+ n*i);
        }
    }
    
}
