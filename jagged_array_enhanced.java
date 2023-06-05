public class jagged_array_enhanced
{
    public static void main(String[] args)
    {
        int a[][]={{10,20,30,40},{10,20,30},{10,20,30,40}};
        for(int element[]:a)
        {
            for(int l:element)
            {
                System.out.print(" "+l);
            }
            System.out.println("");
        }
    }
}
