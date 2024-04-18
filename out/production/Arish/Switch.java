import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
class printswitch{
    void p_R_I_N_T(int a,int b)
    {
       int c;
       Scanner o1 = new Scanner(System.in);
        System.out.println("Enter the option:");
        c = o1.nextInt();
        switch(c) {
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division: "+(a/b));
                break;
            case 5:
                System.out.println("Addition: "+(a%b));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

public class Switch {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a,b;
        a = o.nextInt();
        System.out.println("Enter the second number:");
        b = o.nextInt();
        System.out.println("1->Addition\n2->Subtraction\n3->Multiplication\n4->Division\n5-Modulus\n");
        printswitch o1 = new printswitch();
        o1.p_R_I_N_T(a,b);
    }

}
