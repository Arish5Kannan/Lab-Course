import java.util.*;
class m
{
    public static int square(int num)
    {
        int i = 1;
        int sq = 1;
                while(i<=2)
                {
                    sq = sq * num;
                    i++;
                }
                return sq;
    }
}
class S
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find square: ");
        int num = sc.nextInt();
        int res = m.square(num);
        System.out.printf("Square of %d is %d ",num,res);
    }
}