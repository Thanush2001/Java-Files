import java.util.Scanner;

public class sherlock_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,s,p=0,x,r;
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
            x=a[i];
            s=0;
            while(x>0)
            {
                r=x%10;
                s=s+r;
                x=x/10;
            }
            if(s%2==0)
                p++;
        }System.out.println("Total Sherlock no:"+p);
    }
}
