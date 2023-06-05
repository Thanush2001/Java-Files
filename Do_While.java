import java.util.Scanner;
public class Do_While
{
    public static void main(String[] args)
    {
        System.out.print("Enter the limit:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=2;
        do{
            System.out.println(i);
            i=i+2;
        }while(i<=n);
    }
}
