import java.util.*;
public class reverse_array
{
    public static void main(String[] args)
    {
     int a[]=new int[10],size,i;
     Scanner in=new Scanner(System.in);
     System.out.print("Enter the size of array:");
     size=in.nextInt();
     System.out.println("Enter the element of array:");
     for(i=0;i<size;i++)
     {
         a[i]=in.nextInt();
     }System.out.println("The reverse array element are:");
     for(i=size-1;i>=0;i--)
     {
         System.out.println("a["+i+"]="+a[i]);
     }
    }
}
