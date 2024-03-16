import java.lang.*;
class RectangleShape
{
 int breadth,width;
  public RectangleShape()
  {
      breadth = 4;
      width = 8 ;
  }
    public RectangleShape(int x, int y)
    {
        breadth = x;

        width = y;
    }
    public RectangleShape(int x)
    {
        breadth =width=x;

    }
    public RectangleShape(RectangleShape o3)
    {
        this.breadth = o3.breadth;
        this.width = o3.width;
    }
    public int  area()
    {
        return breadth*width;
    }
}
public  class constructor
{
    public static void main(String[] args)
    {
        RectangleShape o1 = new RectangleShape();
        System.out.println("Area of rectangle: "+o1.area());
        RectangleShape o2 = new RectangleShape(3,4);
        System.out.println("Area of rectangle: "+o2.area());
        RectangleShape o3 = new RectangleShape(3);
        System.out.println("Area of rectangle: "+o3.area());
        RectangleShape o4 = new RectangleShape(o3);
        System.out.println("Area of rectangle: "+o4.area());
    }
}