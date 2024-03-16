class Den
{
    static int a = 30;
    int b = 30;
    void show()
    {
        System.out.println("A:"+a+"B:"+b);
    }
    static void  display()
    {
        System.out.println("Value of a:"+a);
    }
}
public class Static_var_method {
    public static void main(String[] args) {
        Den o = new Den();
        o.show();
        Den o1 = new Den();
        o1.show();
        o.a=90;
        o1.a=8;
        o1.show();
        o.show();
        o1.b=90;
        o.b=80;
        o.show();
        o1.show();
    }
}