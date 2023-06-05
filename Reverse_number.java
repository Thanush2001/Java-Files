import java.util.Scanner;
public class Reverse_number
{
    // Write a program to find the reverse of N digit number.
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=in.nextInt();
    int reverse=0,rem;
    while(n>0)
    {
        rem=n%10;
        reverse=(reverse*10)+rem;
        n=n/10;
    }
    System.out.println("Reverse number:"+reverse);
    }
}
