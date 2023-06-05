import java.util.Scanner;
public class Fibonacci_Series
{
    // Write a program to find the fibonacci Series of given numbers.
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        int a=-1,b=1,c;
        for (int i=1; i<=n; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
