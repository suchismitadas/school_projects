import java.util.Scanner;
class dmsn
{
    public static void main(String[] args)
    {
        int i,j,k,c,n,o;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a single digit number:");
        n=input.nextInt();
        c=n-1;
	for(i=1;i<=n;i++,c--)
        {
            for(o=1;o<=c;o++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(k=j-2;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        c=c+2;
        for(i=n-1;i>=1;i--,c++)
        {
            for(o=1;o<=c;o++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(k=j-2;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}