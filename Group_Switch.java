import java.util.Scanner;
public class Group_Switch
{
    // Group_Switch
    public static void main(String[] args)
    {
        char c;
     System.out.print("Enter the character:");
     Scanner in= new Scanner(System.in);
     c=in.next().charAt(0);
     switch(c)
     {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
             System.out.println(c+" is a vowel");
             break;
         default:
             System.out.println(c+" is not a vowel");
             break;
     }

    }
}
