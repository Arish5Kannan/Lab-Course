import java.lang.*;
class Nameage{
  public int age;
  public String name;
  Nameage(String x,int y)
  {
      this.name = x;
      this.age = y;
  }
    public void print()
    {
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
 public class Aobjects
{
    public static void main(String[] args)
    {
        Nameage[] o = new Nameage[5];
        o[0] = new Nameage("Arish",13);
        o[1] = new Nameage("Kannan",19);
        o[2] = new Nameage("Lokesh",23);
        o[3] = new Nameage("Bharath",17);
        o[4] = new Nameage("Arun",18);
        for(int i=0;i<o.length;i++)
            o[i].print();

    }
}