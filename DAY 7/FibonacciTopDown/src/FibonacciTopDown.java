public class FibonacciTopDown {
    public static int Fibonacci(int N)
    {
        if(N <= 1) return N;
        return Fibonacci(N-1) + Fibonacci(N-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(6));
    }
}
