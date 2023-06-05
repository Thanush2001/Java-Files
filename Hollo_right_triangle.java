import java.util.Scanner;
class Hollo_right_triangle{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i || i==n)
                    System.out.print("*"); // 2 spaces
                else
                    System.out.print(" "); // 2 spaces
            }
            System.out.println();
        }
    }
}
