import java.util.Scanner;

public class Deleting_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,p,e;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size=in.nextInt();
        System.out.println("Enter the element of array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.print("Enter the position of an array:");
        p=in.nextInt();
        if(p<=size)
        {
            for(i=p;i<size;i++)
            {
                a[i]=a[i+1];
            }

            size--;
            for(i=0;i<=size;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            System.out.print((p>size)+" ");
        }
    }
}
