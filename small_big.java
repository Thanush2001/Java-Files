import java.util.Scanner;

public class small_big
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,big,small;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size=in.nextInt();
        System.out.println("Enter the element of array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }
        big=a[0];
        small=a[0];
        for(i=0;i<size;i++)
        {
            if(a[i]>big)
                big=a[i];
            else if(a[i]<small)
                small=a[i];
        }
        System.out.print("big="+big+" "+"small="+small);
    }
}
