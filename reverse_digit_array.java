import java.util.Scanner;

public class reverse_digit_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,r,s,n;
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
            s=0;
            n=a[i];
            while(n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }
            System.out.println("a["+i+"]="+s);
        }
    }
}
