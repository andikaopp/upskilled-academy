import java.util.Scanner;

public class Xoxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = scanner.nextLine();

        String kataWithoutSpace = kata.replaceAll("\\s", "");
        int flagx =0, flago = 0;
        boolean result = false;
        for (int i = 0; i < kataWithoutSpace.length(); i++) {
            char chr = kataWithoutSpace.charAt(i);
            if (chr == 'x' || chr == 'X'){
                flagx++;
            } else if (chr == 'o' || chr == 'O') {
                flago++;
            }
        }

        if (flagx == flago){
            System.out.println(result=true);
        }else {
            System.out.println(result);
        }

    }
}
