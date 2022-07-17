import java.util.Scanner;

public class CekPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int angka = scanner.nextInt();
        System.out.println("Output:");
        CekBilanganPrima(angka);
    }
    static void CekBilanganPrima(int angka){
        int flag=0;
        if(angka > 1){
            for (int i = 1; i < angka; i++) {
                if (angka % i == 0) {
                    flag++;
                }
            }

            if (flag > 2)
            {
                System.out.println("Bukan Bilangan Prima");
            }else {
                System.out.println("Bilangan Prima");
            }
        }else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
