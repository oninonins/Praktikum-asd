package Praktikum14;
import java.util.ArrayList;
import java.util.Collections;

public class CustomerSortDemo {
    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(3, "Zara"));
        customers.add(new Customer(1, "Andi"));
        customers.add(new Customer(2, "Budi"));


        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println("Setelah diurutkan berdasarkan nama: ");
        for (Customer c : customers){
            System.out.println(c.toString());
        }
    }
}
