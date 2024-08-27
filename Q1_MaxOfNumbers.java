public class MaxOfNumbers{
    public static void main(String [] args)
    {
        if(args.length==0)
        {
            System.out.println("enter the numbers on command line");
            return;
        }

        int max=Integer.parseInt(args[0]);

        for(int i=0;i<args.length;i++)
        {
            int number=Integer.parseInt(args[i]);
            if(number>max)
            {
                max=number;
               
            }
        }

        System.out.println("maximum number is " + max);

}
   
}


// import java.util.Scanner;

// public class factorial {

//     public static void main(String[] args){

//         Scanner scanner =new Scanner(System.in);

//         System.out.println("enter the numbers of elements ");

//         int n=scanner.nextInt();
//         if(n<=0)
//         {
//             System.out.println("please enter the positive integer ");
//         }

//         int []numbers=new int[n];

//         for(int i=0;i<n;i++)
//         {
//             numbers[i]=scanner.nextInt();
//         }

//         scanner.close();

//         int max=numbers[0];

//         for(int i=1;i<n;i++)
//         {
//             if(numbers[i]>max)
//             {
//                 max=numbers[i];
//             }
//         }

//         System.out.println("maximum number is " + max);


//     }
    
// }
