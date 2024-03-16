class finaltest
{
    final int l = 10;
    final int b;
    final int h;
     public finaltest(int breadth, int height)
    {
        b = breadth;
        h = height;
    }

    public  void display()
    {
        finaltest o = new finaltest(9,7);
        o.show();
    }
    private void show()
    {
        System.out.println("Length:"+l);
        System.out.println("Breadth:"+b);
        System.out.println("Height:"+h);
    }

}

public class finalVar
{
    public static void main(String[] args) {
        finaltest o = new finaltest(9,7);
        o.display();
    }
}