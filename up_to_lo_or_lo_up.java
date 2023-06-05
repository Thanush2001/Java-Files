import java.lang.*;
import java.util.Scanner;
class uppercase_lowercase
{
    public static void main(String[] args)
    {
        char t;
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter the character:");
        t=obj.next().charAt(0);
        int x=(int)t; //type casting
        if(x>=65 && t<=90)
        {
            x=x+32;
            System.out.print((char)x);
        }
        else
        {
            x=x-32;
            System.out.print((char)x);
        }
    }
}
