class methods
{
    public static int square(num)
    {
        int i = 1;
        int sq = 1;
                while(i<=2)
                {
                    sq = sq * num;
                    i++;
                }
                return sq
    }
}
class A
{
    public static void main(String[] args)
    {
        int num = 2;
        int res = methods.square(num);
        System.out.printf("Square of %d is %d ",num,res);
    }
}