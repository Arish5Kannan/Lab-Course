import java.util.*;
class Array
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the element");
        for(int i = 1;i<=10;i++) {
            int a;
            a = sc.nextInt();
            l.add(a);
        }
        Iterator i = l.iterator();
        System.out.print("ArrayList elements: ");
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }


    }
}