import java.util.Scanner;
public class dectobin
{
    public static void main(String[] args)
    {
        long dec;
        String bin;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal value to be converted to binary value:");
	dec=input.nextInt();
	System.out.println("Decimal value --> "+dec);
	bin="";
        for(;dec!=0;)
        {
            bin=dec%2+bin;
            dec=dec/2;
        }
            System.out.println("Binary value --> "+bin);
    }
}