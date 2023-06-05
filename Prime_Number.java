import java.util.Scanner;
public class Prime_Number
{
    //Write a program to check the given number is prime number or not.
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = in.nextInt();
        int f= 0;
        for (int i=1; i<= n; i++)
        {
            if (n % i == 0)
            {
                f++;
            }
        }
        if (f==2)
        {
            System.out.println(n + " is a prime number");
        }
        else

        {
            System.out.println(n + " is not a prime number");
        }
    }

}

