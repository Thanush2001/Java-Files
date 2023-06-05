import java.util.Scanner;
class new_pattern {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            int x = 'A';
            for (int j = i; j < n; j++) { // loop run for 4 times (j<n)
                System.out.print("  "); //( 2 Space must)
            }
            for (int j = 1; j < i; j++, x++) { // remove equal sign j<=i instead use - j<i
                System.out.print((char) x + " ");
            }
            for (int j = 1; j <= i; j++, x--) {
                System.out.print((char)x + " ");
            }System.out.println();
        }
    }
}
