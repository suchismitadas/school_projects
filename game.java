import java.util.Scanner;

public class game
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        int i=3;
        String p1,p2,p3;
        Scanner input=new Scanner(System.in);
        d=(int) (Math.random()*10);
        System.out.println("Total Attemts = "+i);
        for(;i>=1;)
        {
            System.out.println("Player1's guess:");
            a=input.nextInt();
            System.out.println("Player2's guess:");
            b=input.nextInt();
            System.out.println("Player3's guess:");
            c=input.nextInt();
            if(a==d||b==d||c==d)
            {
                System.out.println("We have a winner !!!!!");
                if(a==d)
                {
                    System.out.println("Player 1 wins"+"\t"+"Guess = "+a);
                }
                if(b==d)
                {
                    System.out.println("Player 2 wins"+"\t"+"Guess = "+b);
                }
                if(c==d)
                {
                    System.out.println("Player 3 wins"+"\t"+"Guess = "+c);
                }
                break;
            }
            else if(a!=d||b!=d||c!=d)
            {
		--i;
                System.out.println("Try again ");
                System.out.println("Attempts left = "+i);
            }
            else
            {
            System.out.println("Game over !");
            }
            }
        System.out.println("Number to be guessed = "+d);
    }
}