import java.util.Scanner;
public class greatnum
{
    public static void main(String[] args)
    {
        int x,y,z;
        greatnum ob= new greatnum();
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        z=ob.maximum(x,y);
        System.out.println("Greater number = "+z);
    }
    public int maximum(int a, int b)
    {
        int an;
        an=(a>b)?a:b;
        return an;
    }
}