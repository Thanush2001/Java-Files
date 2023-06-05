import java.util.Scanner;
public class Else_if_ladder
{
    public static void main(String[] args)
    {
     float avg;
     System.out.print("Enter the Average mark:");
     Scanner in=new Scanner(System.in);
     avg=in.nextFloat();
     if(avg>90 && avg<=100)
     {
         System.out.println("Grade A");
     }
     else if (avg>=80 && avg<=89)
        {
            System.out.println("Grade B");
        }
     else if(avg>=70 && avg<=79)
     {
         System.out.println("Grade C");
     }
     else
     {
         System.out.println("Grade D");
     }

    }
}
