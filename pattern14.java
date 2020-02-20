class pattern14
{
    public static void main(String[] args)
    {
        int i,j,k,c,n,o;
        n=1;
        c=n-1;
        for(i=5;i>=1;i--,c++)
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