import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        int a,b,c,d,e,f;
        e=0;
        f=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a two-digit number:");
        a=input.nextInt();
        System.out.println("Enter another two-digit number:");
        b=input.nextInt();
        for(;a!=0&&b!=0;)
        {
            c=a%10;
            a=a/10;
            d=b%10;
            b=b/10;
            e=a+b;
            f=c*d;
            break;
        }
        System.out.println("Sum of the first digits="+e);
        System.out.println("Product of the second digits="+f);
        
    }
}