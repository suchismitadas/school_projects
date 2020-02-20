import java.util.Scanner;

class great
{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x");
        x=input.nextInt();
        System.out.println("Enter y");
        y=input.nextInt();
        System.out.println("Enter z");
        z=input.nextInt();
        if(x<y)                                                                 
        {
            if(z<x)
            {
                System.out.println(z+" "+x+" "+y);
            }
            else if(z>y)
            {
                System.out.println(x+" "+y+" "+z);
            }
            else
            {
                System.out.println(x+" "+z+" "+y);
            }
        }
        else
        {
            if(z<y)
            {
                System.out.println(z+" "+y+" "+x);
            }
            else if(x<z)
            {
                System.out.println(y+" "+x+" "+z);
            }
            else
            {
                System.out.println(y+" "+z+" "+x);
            }
        }
    }
}