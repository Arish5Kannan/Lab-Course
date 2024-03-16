import java.util.Scanner;
import java.lang.*;
public class bin2dec{
    public static int binary2decimal(int binary)
    {
        int decimal=0,power=0;
        while(binary!=0)
        {
            int rem=binary%2;
            decimal += rem * Math.pow(2,power);
            binary = binary/2;
            ++power;
        }
        return decimal;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int binary = sc.nextInt();
  System.out.println(binary+" Corresponding decimal number :"+binary2decimal( binary));
    }
}