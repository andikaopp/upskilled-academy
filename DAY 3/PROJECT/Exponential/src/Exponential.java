import java.util.Scanner;

public class Exponential {
    static int pangkat(int x,int n){
        return (int) Math.pow(x,n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x:");
        int x = scanner.nextInt();
        System.out.print("Input n:");
        int n = scanner.nextInt();
        System.out.println("Hasil: "+ pangkat(x,n));
    }
}
