final class deo
{
    public void show()
    {
        System.out.println("I am showing my rights");
    }
}
/*class Deoz extends deo{
    @Override
    public void show() {
        System.out.println("I am showing my rights after overrided");
    }
}*/
public class finalClass {
    public static void main(String[] args) {
       deo o = new deo();
        o.show();
    }
}