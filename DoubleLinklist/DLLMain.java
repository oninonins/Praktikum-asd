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
            System.out.println("8. Tambah node pada indeks tertentu");
            System.out.println("9. Hapus node setelah NIM tertentu");
            System.out.println("10. Hapus node pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama/terakhir/indeks");
            System.out.println("12. Tampilkan jumlah data");
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
                    Node05 hasil = lists05.search(nim);
                    if (hasil != null) {
                        System.out.println("Data ditemukan:");
                        hasil.data.tampil();
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
                    case 8: 
                    System.out.print("Masukkan indeks: ");
                    int index = input.nextInt();
                    input.nextLine();
                    Mahasiswa05 m3 = inputMahasiswa(input);
                    lists05.add(m3, index);
                    break;
                case 9: 
                    System.out.print("Masukkan NIM: ");
                    String nimKey = input.nextLine();
                    lists05.removeAfter(nimKey);
                    break;
                case 10: 
                    System.out.print("Masukkan indeks: ");
                    int rmIndex = input.nextInt();
                    input.nextLine();
                    lists05.remove(rmIndex);
                    break;
                case 11: 
                    System.out.println("1. Tampilkan data pertama");
                    System.out.println("2. Tampilkan data terakhir");
                    System.out.println("3. Tampilkan data pada indeks");
                    System.out.print("Pilih: ");
                    int pilih = input.nextInt();
                    input.nextLine();
                    if (pilih == 1) {
                        Mahasiswa05 first = lists05.getFirst();
                        if (first != null) first.tampil();
                    } else if (pilih == 2) {
                        Mahasiswa05 last = lists05.getLast();
                        if (last != null) last.tampil();
                    } else if (pilih == 3) {
                        System.out.print("Masukkan indeks: ");
                        int idx = input.nextInt();
                        input.nextLine();
                        Mahasiswa05 indexKe = lists05.getIndex(idx);
                        if (indexKe != null) indexKe.tampil();
                    }
                    break;
                case 12: 
                    System.out.println("Jumlah data: " + lists05.size());
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