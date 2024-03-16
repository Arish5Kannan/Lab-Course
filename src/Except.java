import javax.naming.NameNotFoundException;

public class Except
{
    public static void main(String[] args) throws NameNotFoundException {
        try
        {
            int a = 10,b=0;
            System.out.println(a/b);
            int[] arr = new int[5];
            arr[5] = 6;
            int c = 10;
            System.out.println(""+arr[0]+""+arr[1]);
            System.out.println(b/a);
        }
        catch(ArithmeticException e)
        {
            System.err.println("Arithmetic Exception occurs");
        }
        catch(Exception e)
        {
            System.err.println("Exception occurs");
        }


    }
}