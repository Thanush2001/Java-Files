import java.util.Scanner;
class Arithmatic_Operator
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 2 values:");
        System.out.print("Enter the a value=");
        a=obj.nextInt();
        System.out.print("Enter the b value=");
        b=obj.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulus:"+(a%b));
    }
}
