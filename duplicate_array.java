public class duplicate_array
{
    public static void main(String[] args)
    {
     int[]a={1,2,5,5,6,7,7,2};
     for(int i=0;i<a.length-1;i++)
     {
         for(int j=i+1;j<a.length;j++)
         {
             if(a[i]==a[j]) //or (i!=j)
                 System.out.println("Dupilicate element:"+a[j]);
         }
     }
    }
}
