public class abc
{
    public static void main(String[] args)
    {
        // object
        abc obj = new abc();
        System.out.println(obj.addition(3, 4));
        System.out.println(obj.subtraction());
        obj.multiply();
        obj.division(10,2);

        // static
        System.out.println(abc.addition(3, 4));
        System.out.println("Subtraction="+abc.subtraction());
        abc.multiply();
        abc.division(10,2);
    }

        // return type with argument
        static int addition(int x,int y)
        {
            return x+y;
        }

        //return type without argument
    static int subtraction()
    {
        return(5-2);
    }

    // no return without argument
    static void multiply()
    {
        System.out.println("mul="+(4*5));
    }
    // no return with arguments

    static void division(int x,int y)
    {
        System.out.println("div="+(x/y));
    }
}
