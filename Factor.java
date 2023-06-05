import java.util.Scanner;
public class Factor
{
    //Write a program to find the factor of the given number.
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        for (int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
