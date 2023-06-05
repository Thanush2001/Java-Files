import java.util.Scanner;

public class method{
    public static void main(String[] args) {

        // calling method using object
        method obj = new method();
        System.out.println(obj.addition(25, 20));
        System.out.println( obj.subtraction());
        obj.multiply();
        obj.division(10,2);
        System.out.println("--------------------------------------------");

        //calling method using static
        System.out.println(method.addition(25,20));
        System.out.println(method.subtraction());
        method.multiply();
        method.division(10,2);


       /*return type - datatypes byte short int long float double char boolean
       non return - void

       function/ methods/procedures - object name or ( static - class name )

       method signature - 4 keywords
       AccessModifiers static returnType methodName(---------){
       }

       AccessModifiers - public private protected default
        */
    }
    // return type with arguments
    static int addition(int a, int b){
        return a+b;
    }
    // return type without argument
    private static int subtraction(){
        return 32-2;
    }
    //no return without argument
    public static void multiply(){
        System.out.println(32*2);
    }
    //no return with argument
    public static void division(int a, int b){
        System.out.println(a/b);
    }

}