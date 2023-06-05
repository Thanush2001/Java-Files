import java.util.Scanner;
public class Sum_Avg
{
    // write a program to find the sum and average of given n numbers.
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the limit:");
    int n=in.nextInt();
    int sum=0,a;
    for(int i=1; i<=n; i++)
        {
            System.out.print("Enter the Number"+i+":");
            a=in.nextInt();
            sum=sum+a;
        }
        System.out.println("The Sum of given numbers is :"+sum);
        System.out.println("The Average of given numbers is :"+sum/n);
    }
}
