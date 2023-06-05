import java.util.Scanner;
public class Factorial
{
    // Write a program to find the factorial of given numbers:
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the factorial number:");
    int n=in.nextInt();
    int f=1;
    for(int i=1; i<=n; i++)
    {
        f=f*i;
    }
    System.out.println("Factorial of "+n+" is "+f);
    }
}
