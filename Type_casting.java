//Type casting in java

/*
1.Widening casting=[small memory to large]
    byte-short-char-int-long-float-double

2.Narrowing Casting=[large to small memory]
    double-float-long-int-char-short-byte
 */

// 1.Widening casting program
/*
import java.lang.*;
class Widening
{
    public static void main(String[] args)
    {
        int a=10;
        double b=a;
        System.out.println("Int:"+a);
        System.out.println("Double:"+b);
    }
}
*/

// 2. Narrowing casting program
import java.lang.*;
class Narrowing
{
    public static void main(String[] args)
    {
        int a=10;
        double b=a,d=25.5385;
        int c=(int)d;
        System.out.println("Int:"+a);
        System.out.println("Double:"+b);
        System.out.println("Double:"+d);
        System.out.println("Int:"+c);
    }
}