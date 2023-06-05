import java.util.Scanner;
public class Switch_case
{
    public static void main(String[] args)
    {
        int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplycation");
        System.out.println("4.Division");
        System.out.print("Enter your choice :");
        Scanner in =new Scanner(System.in);
        ch=in.nextInt();
        System.out.println("Enter the 2 Number:");
        a=in.nextInt();
        b=in.nextInt();
        switch (ch)
        {
         case 1:
            c=a+b;
            System.out.println("Addition:"+c);
            break;
            case 2:
                c=a-b;
         System.out.println("Subtraction:"+c);
         break;
         case 3:
            c=a*b;
         System.out.println("Multiplycation:"+c);
         break;
         case 4:
            c=a/b;
         System.out.println("Division:"+c);
         break;
         default:
            System.out.println("Invalid Selection");
        }
    }
}
