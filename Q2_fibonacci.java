import java.util.Scanner;
public class Q2_fibonacci {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the number ");
        
        int n=scanner.nextInt();
        
        scanner.close();
        
        System.out.println("fibonacci series upto n numbers ");
        
        int first=0,second=1;
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(first + " ");
            
            int next=first+second;
            
            first=second;
            second=next;
        }
        
    }
}
