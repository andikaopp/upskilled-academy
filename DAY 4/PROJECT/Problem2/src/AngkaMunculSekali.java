import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AngkaMunculSekali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String angka = scanner.nextLine();

        String[] arrayAngka = angka.split("");
        String[] groupAngka = {"0","1","2","3","4","5","6","7","8","9"};
        ArrayList<String> listAngkaSingle = new ArrayList<>(Arrays.asList(groupAngka));
        ArrayList<String> listAngkaSingle2 = new ArrayList<>(Arrays.asList(arrayAngka));
        ArrayList<String> arrResult = new ArrayList<>();

        int flag=0;
        for (int j = 0; j < listAngkaSingle.size(); j++) {
            for (int i = 0; i < listAngkaSingle2.size(); i++) {
                if (listAngkaSingle2.get(i).contains(listAngkaSingle.get(j))){
                    flag++;
                }
            }
            if(flag==1) {
                arrResult.add(listAngkaSingle.get(j));
            }
            flag=0;
        }
        System.out.println(arrResult);


    }
}
