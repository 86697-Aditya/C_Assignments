
import java.util.Scanner;
public class Q3_factorial
{
    public static void main(String []args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");

        int n=scanner.nextInt();

        scanner.close();
        int ans=1;

       for(int i=n;i>0;i--)
       {
          
        ans=ans*i;
       }

       System.out.println("factorial of the number " + n + " is " + ans);

    }

}