/*
Nested if statement
A company insures its drivers in the following cases:
    a.If the driver is married.
    b.if the driver is unmarried,male & above 30 years of age.
    c.If the driver is unmarried,female &above 25 years of age.
 */
import java.util.Scanner;
public class Nested_if_statement
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the marital status M/U:");
        char marital=in.next().charAt(0);
        if(marital=='u' || marital=='U')
        {
            System.out.print("Enter the Gender M/F:");
            char gender = in.next().charAt(0);
            System.out.print("Enter the age:");
            int age = in.nextInt();

            if ((gender == 'M' || gender == 'm') && (age >= 30))
            {
                System.out.println("you are Eligible for insurance");
            }
            else if ((gender == 'F' || gender == 'f') && (age >= 25))
            {
                System.out.println("you are eligible for insurance");
            }
            else
            {
                System.out.println("you are not eligible for insurance");
            }
        }
        else if (marital=='m' || marital=='M')
            {
                System.out.println("you are eligible for insurance");
            }
        else
            {
                System.out.println("Invalid input");
            }
    }
}
