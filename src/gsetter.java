import java .util.Scanner;
import java.lang.*;
class car
{
    private String color,name,model;
    private int price,num;
    public String getColor()
    {
        return color;
    }
    public String getName()
    {
        return name;
    }
    public String getModel()
    {
        return model;
    }
    public int getPrice()
    {
        return price;
    }
    public int getNum()
    {
        return num;
    }
    public void setPrice(int x)
    {
        this.price = x;
    }
    public void setNum(int x)
    {
        this.num = x;
    }
    public void setColor(String  x)
    {
        this.color=x;
    }
    public void setname(String  x)
    {
        this.name=x;
    }
    public void setModel(String  x)
    {
        this.model=x;
    }
    public void cardetails()
    {
        System.out.println("   Car Details");
        System.out.println("Car name   : "+name);
        System.out.println("Car color  : "+color);
        System.out.println("Car Model  : "+model);
        System.out.println("Car price  : "+price);
        System.out.println("Car number : "+num);

    }

}
public class gsetter
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int x = 1;
       int y = 500000;
       String Z = "Red";
       String a = "Maruthi Alto";
       String b = "Suv 35";
       car obj = new car();
       obj.setColor(Z);
       obj.setname(a);
       obj.setModel(b);
       obj.setNum(x);
       obj.setPrice(y);
       obj.cardetails();
       System.out.println("Car color : "+obj.getColor());
       System.out.println("Car number: "+obj.getNum());
       System.out.println("Car Name  : "+obj.getName());
       System.out.println("Car price : "+obj.getPrice());
       System.out.println("Car model :"+obj.getModel());
   }
}