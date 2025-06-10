package Praktikum14;
import java.util.ArrayList;
import java.util.Collections;

public class SortPercobaan {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        names.add("Zara");
        names.add("Andi");
        names.add("Budi");

        

        Collections.sort(names);

        System.out.println("Hasil sorting: ");
        for (String name : names){
            System.out.println(name);
        }

    }
}
