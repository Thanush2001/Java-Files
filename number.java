import java.util.Scanner;
class number{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        for(int i=1,x=0;i<=n;i++,x+=2){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
            }
            System.out.println();
        }}}