import java.util.Scanner;
public class Perfect_number_or_not
{
    // Write a program to check the given number is perfect number or not.
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        int sum=0;
        for (int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }

    }
}
