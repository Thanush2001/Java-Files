import java.util.Scanner;

public class prime_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,j,c;
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
            c=0;
            for(j=1;j<=a[i];j++) // = remove not prime number display
            {
                if (a[i] % j == 0)
                    c++;
            }
            if(c==2)
                System.out.println("prime number are:"+a[i]);
        }
    }
}
