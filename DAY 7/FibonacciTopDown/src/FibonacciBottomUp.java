public class FibonacciBottomUp {
    public static int Fibonacci(int N)
    {
        int[] Fib = new int[N+1];

        Fib[0] = 0;
        Fib[1] = 1;

        for(int i = 2; i <= N; i++) {
            Fib[i] = Fib[i - 1] + Fib[i - 2];
        }

        return Fib[N];
    }

    public static void main(String[] args) {
        int n = 6;
        if(n <= 1) System.out.println(n);
        else System.out.println(Fibonacci(n));
    }
}
