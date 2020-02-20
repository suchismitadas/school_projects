public class ex1
{
    String code,title;
    double price;
    public ex1(String c, String t, double p)
    {
        code=c;
        title=t;
        price=p;
    }
    public String getcode()
    {
        return code;
    }
    public String gettitle()
    {
        return title;
    }
    public double getprice()
    { 
        return price;
    }
    public static void main(String[] args)
    {
        ex1 book1 = new ex1("Tech001","Java",175d);
        System.out.println("Book code: "+book1.getcode()+"\t"+"Book Name: "+book1.gettitle()+"\t\t"+"Price: "+book1.getprice());
        
    }
}