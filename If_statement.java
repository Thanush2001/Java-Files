import java.util.Scanner;
public class If_statement
{
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age:");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        if (age > 18)
        {
            System.out.println("You are Eligible for vote....");
        }
    }
}
