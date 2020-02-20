//To check whether a number is prime or not.
import java.util.Scanner;

class primetest
{
    public static void main(String[] args) 
    {
        int n,i,count,flag;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to be tested:");
        n=input.nextInt();
        for(count=0;count<=n;count++)
        {
            flag=0;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
            {
                System.out.println("Prime");
                    break;
            }
            else
            {
                System.out.println("Not-Prime");
                    break;
            }
        }
    }
}