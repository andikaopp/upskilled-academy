import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = scanner.nextLine();
        System.out.println("Output:");

        String balikKata="";
        for (int i = 0; i < kata.length(); i++) {
            char chr = kata.charAt(i);
            balikKata = chr+balikKata;
        }

        if (kata.equals(balikKata)) {
            System.out.println("Polindrome");
        }else {
            System.out.println("Bukan Polindrome");
        }
    }
}
