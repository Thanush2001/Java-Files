import java.util.*;
public class one_d_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of arrays:");
        size=in.nextInt();
        System.out.println("Enter the elements to array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("The array element are");
        for(i=0;i<size;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
