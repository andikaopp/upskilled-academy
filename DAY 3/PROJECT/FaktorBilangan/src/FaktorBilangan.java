import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int angka = scanner.nextInt();

        System.out.println("Output:");
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                System.out.println(i);
            }
        }
    }
}
