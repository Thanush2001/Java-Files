import java.util.Scanner;

public class palindrome_array
{
    public static void main(String[] args)
    {
        int a[]=new int[10],size,i,s,p=0,x;
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
                s=s*10+x%10;
                x=x/10;
            }
            if(s==a[i])
                p++;
        }System.out.println("Total palindrome no:"+p);
    }
}
