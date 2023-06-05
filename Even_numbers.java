import java.util.Scanner;
public class Even_numbers
{
    public static void main (String[] args)
    {
        int i,n,s=0;
        System.out.print("Enter the n values:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1; i<=n; i++)
        {
            s=s+i;
        }
        System.out.println("Sum="+s);
    }
}