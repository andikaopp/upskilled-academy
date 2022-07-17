import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int input = scanner.nextInt();
        System.out.println("Output:");

        int angka=0;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                angka = i + angka;
                System.out.print(angka);
                System.out.print(" ");
            }
            angka = 0;
            System.out.println("");
        }
    }
}
