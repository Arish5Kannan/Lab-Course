import java.lang.*;
import java.util.Scanner;
class math{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float:");
        float a = sc.nextFloat();
        System.out.println("Enter float:");
        float b = sc.nextFloat();
        System.out.println("The  two integer:" + a + "and " + b);
        System.out.println("Absolute value:"+Math.abs(a));
        System.out.println("Rounded value:"+Math.round(b));
        System.out.println("Ceiled value:"+Math.ceil(b));
        System.out.println("Floor value:"+Math.floor(a));
        System.out.println("Squareroot:"+Math.sqrt(3));
        System.out.println("Maximum value:"+Math.max(a,b));
        System.out.println("Log of a:"+Math.log(a)+" and Log of b:"+Math.log(b));
        System.out.println("Tan of a:"+Math.tan(a));
        System.out.println("Log10 of a:"+Math.log10(a));
        System.out.println("Cos of a:"+Math.cos(a));
        System.out.println("Sine of a:"+Math.sin(a));
        System.out.println("power of a^2:"+Math.pow(a,b));


    }
}