class pascal
{
    public static void main(String[] args)
    {
        int row=5;                       //can be changed to vary the size of the triangle
        int c=row-1;
        int[] prv;
        int[] crv = {1};
        prv=crv;
        for(int i=1;i<=row;i++,c--)
        {
            crv = new int[i];
            crv[0] = 1;
            crv[i-1] = 1;
            for(int j=0;j<=i-3;j++)
            {
                crv[j+1] = prv[j]+prv[j+1];
            }
            for(int k=1;k<=c;k++)
            {
                System.out.print(" ");
            }
            for(i=0;i<crv.length;i++)
            {
                System.out.print(crv[i]+" ");
            }
            System.out.println();
            prv=crv;
        }
    }
}