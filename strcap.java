class strcap
{
    public static void main(String[] args)
    {
        String n,k,s;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String:");
        n=input.nextLine();
        n=" "+n;
        n=n.toLowerCase();
        k="";
        int l=n.length();
        for(int i=0;i<l;i++)
        {
            char c=n.charAt(i);
            k+=c;
            if(c==32)
            {
                char y = n.charAt(++i);
                y-=32;
                k+=y;
            }
        }
        s=k.trim();
        System.out.println(s);
    }
}