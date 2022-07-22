public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));  // 8
        System.out.println(pow(5, 3));  // 125
        System.out.println(pow(10, 2)); // 100
        System.out.println(pow(2, 5)); // 32
        System.out.println(pow(7, 3));  // 343
    }

    static Integer pow(Integer x, Integer n) {

        if (n == 0)
            return -1;
        else if (n % 2 == 0)
            return pow(x, n / 2) * pow(x, n / 2);
        else
            return x * pow(x, n / 2) * pow(x, n / 2);
    }

}
