import java.util.Scanner;

public class strong_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,j,s,x,r,f,strong=0;
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
                r = x % 10;
                f = 1;
                for (j = 1; j <= r; j++)
                {
                    f = f*j;
                }
                s = s+f;
                x = x/10;
            }
            if(s==a[i])
            {
                strong++;
            }
        }System.out.println("Total strong no:"+strong);
    }
}
