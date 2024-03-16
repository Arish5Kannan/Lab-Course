import java.util.*;
class big
{
    int n1,n2;
    big(int x,int y)
    {

        n1 = x;
        n2 = y;
    }
    private int biggest() {
        if(n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
       public int show()
        {
            int a = biggest();
           return a;
        }

}
public class Nesting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        big o = new big(a,b);
        int c = o.show();
        System.out.println("Biggest number: "+c);
    }
}