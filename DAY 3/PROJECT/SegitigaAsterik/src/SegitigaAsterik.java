import java.util.Scanner;

public class SegitigaAsterik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int input = scanner.nextInt();
        System.out.println("Output:");

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
