import java.io.*;
import java.util.*;
public class inputIO {

    public static void main(String[] args) throws Exception {
        int a;
        float b;
        double c;
        String d;
        boolean e;
        byte f;
        short g;
        long h;
        char i;
        DataInputStream sc = new DataInputStream(System.in);
        System.out.print("Enter int:");
        a = Integer.parseInt(sc.readLine());
        System.out.print("Enter Float:");
        b = Float.parseFloat(sc.readLine());
        System.out.print("Enter Double:");
        c = Double.parseDouble(sc.readLine());
        System.out.print("Enter String:");
        d = sc.readLine();
        System.out.print("Enter Boolean:");
        e = Boolean.parseBoolean(sc.readLine());
        System.out.print("Enter Byte:");
        f = Byte.parseByte(sc.readLine());
        System.out.print("Enter Short:");
        g = Short.parseShort(sc.readLine());
        System.out.print("Enter Long:");
        h = Long.parseLong(sc.readLine());
        System.out.print("Enter character:");
        Scanner s = new Scanner(System.in);
        i = s.next().charAt(0);
        System.out.println("Int:"+a);
        System.out.println("Float:"+b);
        System.out.println("Double:"+c);
        System.out.println("String:"+d);
        System.out.println("Boolean:"+e);
        System.out.println("Byte:"+f);
        System.out.println("Short:"+g);
        System.out.println("Long:"+h);
        System.out.println("Char:"+i);


    }
}
