public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }

    static boolean primeNumber(Integer number) {
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
