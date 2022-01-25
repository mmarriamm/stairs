public class stairs {
    public static int stairs(int n)
    {
        if (n == 0)
            return 0;
        else if (n < 0)
            return 0;
        else return stairs(n-2) + stairs(n-1);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(stairs(n));
    }


}
