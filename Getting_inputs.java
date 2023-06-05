import java.util.Scanner;
class Getting_inputs
{
    //a2+b2+2ab
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result:"+c);
    }
}
