import java.util.Scanner;
public class bintodec
{
    public static void main(String[] args)
    {
        long bin,dec,power,tmp;
        Scanner input=new Scanner(System.in);
        dec=0;
        power=0;
        System.out.println("Enter binary value to be converted to decimal number:");
        bin=input.nextLong();
	System.out.println("Binary value --> "+bin);
        for(;true;power++)
        {
        if(bin==0)
        {
            break;
        }
        else
        {
            tmp=bin%10;
            dec+=tmp*Math.pow(2,power);
            bin/=10;
        }
    }
        System.out.println("Decimal value --> "+dec);
    }
}