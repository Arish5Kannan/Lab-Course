import java.util.Scanner;
import java.lang.*;

class getset
{
    private int length,breadth;
    public int getLengthBreadth()
    {
        return breadth;
    }


    public void setLengthBreadth(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public  int area()
    {
        int area=length * breadth;
        return area;
    }
}
public class getterSetter{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int a = sc.nextInt();
        System.out.print("Enter the breadth:");
        int b = sc . nextInt();
        getset obj = new getset();
        obj.setLengthBreadth(a,b);
        System.out.println("Area : "+obj.area());
    }
}