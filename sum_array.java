import java.util.Scanner;

public class sum_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,s=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size=in.nextInt();
        System.out.println("Enter the element of array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
            s=s+a[i];
        }
        System.out.print("Sum="+s);
    }
}
