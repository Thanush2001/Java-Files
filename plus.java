import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (j==n/2+1 || i==n/2+1)
                    System.out.print("*"); // 1 star 1 Spaces
                else
                System.out.print(" "); // 2 spaces
            }
            System.out.println();
        }
    }
}