import java.util.ArrayList;
import java.util.HashSet;

public class ArrayMerge {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("andika");
        name.add("fery");
        name.add("emas");
        name.add("robih");
        name.add("ragil");
        System.out.print("Array Input 1: ");
        System.out.println(name);

        ArrayList<String> name2 = new ArrayList<>();
        name2.add("andika");
        name2.add("ragil");
        name2.add("gio");
        name2.add("nanda");
        System.out.print("Array Input 2: ");
        System.out.println(name2);

        ArrayList<String> name3 = new ArrayList<>();
        name3.addAll(name);
        name3.addAll(name2);
        System.out.print("Array Input 3: ");
        System.out.println(name3);


        System.out.print("Output:");
        HashSet<String> nameMerge = new HashSet<>(name3);
        System.out.println(nameMerge);
    }
}
