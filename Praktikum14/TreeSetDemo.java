package Praktikum14;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        System.out.println("Isi TreeSet: ");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        //mehtod khusus
        System.out.println("\nFirst: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("\nSetelah remove 'Jeruk': " + fruits);

        fruits.pollFirst();
        System.out.println("\nSetelah pollFirst: " + fruits);

        fruits.pollLast();
        System.out.println("\nSetelah pollLast: " + fruits);
    }
}
