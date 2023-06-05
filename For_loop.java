import java.util.Scanner;
public class For_loop
{
    public static void main(String[] args)
    {
        System.out.print("Enter the limit:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i=1; i<=n; i++)
        {
            System.out.println(i);
        }

    }
}
