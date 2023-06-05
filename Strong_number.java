import java.util.Scanner;

public class Strong_number
{
    // Write a program to check the given number strong number or not.
    public static void main(String[] args)
    {
        int num,originalnum,rem,fact,i,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=in.nextInt();
        originalnum=num;
        while(num>0)
        {
            rem=num%10;
            System.out.println("Remainder:"+rem);
            fact=1;
            for (i=1; i<=rem; i++)
            {
                fact*=i;
            }
            System.out.println("factorial:"+fact);
            sum=sum+fact;
            num=num/10;
        }
        if(sum==originalnum)
        {
            System.out.println(originalnum+" is strong number");
        }
        else
        {
            System.out.println(originalnum+" is not a strong number");
        }
    }
}
