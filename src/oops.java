import java.util.Scanner;
import java.lang.*;
class rectangle
{
    int length,breadth;
    public int area(int x,int y)
    {
        length =x;
         breadth = y;
         int Area=x*y;
         return Area;
    }
}
public class oops
{
    public static void main(String args[])
    {
        rectangle obj = new rectangle();

        System.out.println("Area of rectangle: "+obj.area(12,34));
        obj.length = 62;
        obj.breadth = 44;
        int a=obj.length;
        int b=obj.breadth;
        System.out.print("Area of rectangle:"+obj.area(a,b));
    }
}
