import java.util.Scanner;
public class even_odd_array
{
    public static void main(String[] args)
    {
        int e=0,o=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limt:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a["+i+"]value:");
            a[i]=in.nextInt();
        }
        for(int element:a)
        {
            if(element%2==0)
             e++;
            else
             o++;
        }
        System.out.println("Total Even num:"+e);
        System.out.print("Total odd num:"+o);
    }
}
