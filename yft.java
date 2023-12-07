public class yft
{
    public static void main(String [] args)
    {
        ug adding = (a, b) -> {
            int sum = 0;
            for(int i = a; i <= b; i++)
            {
                sum += i;
            }
            return sum;
        };

        int num = adding.add(1,3);
        System.out.println(num);
    }
}