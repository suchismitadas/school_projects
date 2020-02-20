class pattern7
{
    public static void main(String[] args)
    {
        int n,i,j,c,k;
        n=5;
        c=n-1;
        for(i=5;i>=1;i--,c--)
        {
            for(k=1;k<=c;k++)
            {
                System.out.print("  ");
            }
            for(j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}