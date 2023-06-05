import java.util.Scanner;
class pattern
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i,x='A';j<=n;j++,x++)
            {
                System.out.print((char) x+" ");
            }
            System.out.println();
        }
    }
}