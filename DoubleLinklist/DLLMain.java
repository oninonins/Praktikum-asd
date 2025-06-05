package DoubleLinklist;
import java.util.Scanner;
public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists05 lists05 = new DoubleLinkedLists05();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah NIM tertentu"); 
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa05 m1 = inputMahasiswa(input);
                    lists05.addFirst(m1);
                    break;
                case 2:
                    Mahasiswa05 m2 = inputMahasiswa(input);
                    lists05.addLast(m2);
                    break;
                case 3:
                    lists05.removeFirst();
                    break;
                case 4:
                    lists05.removeLast();
                    break;
                case 5:
                    lists05.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    Node05 result = lists05.search(nim);
                    if (result != null) {
                        System.out.println("Data ditemukan:");
                        result.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 7: 
                    System.out.print("Masukkan NIM Yang dicari: ");
                    String keyNim = input.nextLine();
                    Mahasiswa05 newData = inputMahasiswa(input);
                    lists05.insertAfter(keyNim, newData);
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }

    public static Mahasiswa05 inputMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan IPK: ");
        Double ipk = Double.parseDouble(input.nextLine());;
        input.nextLine(); 
        return new Mahasiswa05(nim, nama, kelas, ipk);
    }
}