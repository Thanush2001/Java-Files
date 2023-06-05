import java.util.Scanner;

public class factorial_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,j,f;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size=in.nextInt();
        System.out.println("Enter the element of array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<size;i++)
        {
            f=1;
            for(j=1;j<=a[i];j++)
            {
                f=f*j;
            }
            System.out.println("factorial of "+a[i]+"="+f);
        }
    }
}
