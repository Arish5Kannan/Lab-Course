import java.util.*;
import java.io.*;
class details{
    public String name,email,phno;
    Scanner sc = new Scanner(System.in);
    DataInputStream sr = new DataInputStream(System.in);
    public void getdetails() throws IOException {
        boolean i = false;
        System.out.print("Enter your name:");
        name =  sc.next();
        System.out.print("Enter your phone number:");
        phno = sr.readLine();
        System.out.print("Enter your Email id:");
        email = sc.next();


    }
    public void printdeatails()
    {
        System.out.println("Name     : "+name);
        System.out.println("Mobile no: "+phno);
        System.out.println("Email    : "+email);
    }
}
class food_items {


       public  int  choice;
       Scanner sc = new Scanner(System.in);

    void buy1()
    {
        int idr = 50,dosr = 150,ponr = 60,por = 60;
        int id=0,dos=0,po=0,pon=0,count=0,id_count,dos_count,pon_count,po_count;
        System.out.println("Enter your no of set of idli you want:");
        id = sc.nextInt();
        id_count = id * idr;
        System.out.println("Enter your no of dosa you want or else give 0");
        dos = sc.nextInt();
        dos_count = dos * dosr;
        System.out.println("Enter your no of poori you want or else give 0");
        po = sc.nextInt();
        po_count = por * po;
        System.out.println("Enter your no of pongal you want or else give 0");
        pon = sc.nextInt();
        pon_count = pon * ponr;
        System.out.println("Have a nice breakfast !   Your bill is on the way .. Visit again");
        count = id_count + dos_count + po_count+ pon_count;
        System.out.println("  Your Bill  ");
        details ob = new details();
        ob.printdeatails();
        System.out.println("food_items    Quantity   Amount");
        System.out.println("  idli          "+id+"          "+id_count);
        System.out.println("  Dosa          "+dos+"         "+dos_count);
        System.out.println("  poori         "+po+"          "+po_count);
        System.out.println("  pon           "+pon+"          "+pon_count);
        System.out.println("                         Total price = "+count);
    }
    void buy2()
    {
        int mtea = 0,mor;
    }
    void Items()
    {
        System.out.println("1 -----> Breakfast\n2 -----> Morning Tea\n3 -----> Lunch\n4 -----> Evening Tea\n5 -----> Dinner\n6 -----> Beverages");
        System.out.println("Enter your Items choice:");
        choice = sc.nextInt();
        int ch_switch;
        switch (choice)
        {

            case 1:
                System.out.println("         Breakfast Menu        ");
                System.out.println(" s.no    Menu   Quantity  Price");
                System.out.println(" 1        Idli     2         50");
                System.out.println(" 2        Dosa     1         150");
                System.out.println(" 3        Poori    1         60");
                System.out.println(" 4        pongal   1         60");

                food_items ch1 = new food_items();
                ch1 .buy1();

                break;
            case 2:
                System.out.println( "Menu\n\tContinental");
                food_items ch2 = new food_items();
                ch2.buy2();
                break;
            default:
                System.out.println("Try some other choice");
        }

    }
}


class Five_star{
    public static void main(String[] args) throws IOException {
        System.out.println("----Welcome to Hotel The Grand White Palace-----");
        int a,b,c;
        details obj = new details();
        try {
             obj.getdetails();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        food_items obj1 = new food_items();
        obj1.Items();
    }
}