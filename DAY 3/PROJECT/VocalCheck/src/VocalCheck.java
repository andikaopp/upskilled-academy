import java.util.Scanner;

public class VocalCheck {
    public static void main(String[] args) {
        System.out.println("Masukkan kata/kalimat: ");
        Scanner input = new Scanner(System.in);
        String kataInput = input.nextLine();
        String kata = kataInput.replaceAll("\\s","");

        int countvocal =0;
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            switch (karakter) {
                case 'a', 'o', 'e', 'u', 'i', 'A', 'I', 'U', 'E', 'O' -> countvocal++;
            }
        }

        int konsonan = kata.length() - countvocal;
        System.out.println("Output:");
        System.out.println("Karakter Vocal: " + countvocal);
        System.out.println("Karakter Konsonan: " + konsonan);
        System.out.println("Total Karakter: " + kata.length());
    }
}
