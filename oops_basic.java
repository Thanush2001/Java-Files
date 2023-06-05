import java.util.Scanner;
public class oops_basic {
    int a, b, c;
    Scanner obj = new Scanner(System.in);

    void get() {
        System.out.println("Enter the values:");
        a = obj.nextInt();
        b = obj.nextInt();
    }

    void calc() {
        c = a + b;
    }

    void show() {
        System.out.println(" sum of two no:" + c);
    }
}
class sub {
    int a, b, c;
    Scanner obj = new Scanner(System.in);

    void get() {
        System.out.println("Enter the values:");
        a = obj.nextInt();
        b = obj.nextInt();
    }

    void calc() {
        c = a - b;
    }

    void show() {
        System.out.println(" sub of two no:" + c);
    }

}
class mul {
    int a, b, c;
    Scanner obj = new Scanner(System.in);

    void get() {
        System.out.println("Enter the values:");
        a = obj.nextInt();
        b = obj.nextInt();
    }

    void calc() {
        c = a * b;
    }

    void show() {
        System.out.println(" multiply of two no:" + c);
    }
}
class A1
{
    public static void main(String[] args) {
        oops_basic k1 = new oops_basic();
        sub k2= new sub();
        mul k3=new mul();
        k1.get();
        k1.calc();
        k1.show();
        k2.get();
        k2.calc();
        k2.show();
        k3.get();
        k3.calc();
        k3.show();
    }
}
