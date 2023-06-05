import java.util.Scanner;
public class Multiplication_tables
{
    public static void main(String[] args)
    {
     Scanner in= new Scanner(System.in);
     System.out.print("Enter the table:");
     int t=in.nextInt();
     System.out.print("Enter the limit:");
     int n=in.nextInt();
     for(int i=1; i<=n; i++)
     {
         System.out.println(t+"x"+i+"="+(t*i));
     }
    }
}
