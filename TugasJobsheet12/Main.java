package TugasJobsheet12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queuelinkedlist antrian = new Queuelinkedlist();
        int pilihan;

        do {
            System.out.println("Menu Antrian Mahasiswa");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. kosongkan Antrian");
            System.out.println("7. Lihat Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear the newline character

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = input.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan, keperluan);
                    antrian.enqueue(mhs);
                    System.out.println("Mahasiswa telah ditambahkan ke antrian.");
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.peekLast();
                    break;

                case 5:
                    System.out.println("Jumlah Antrian: " + antrian.size);
                    break;

                case 6:
                    antrian.clear();
                    break;
                case 7:
                antrian.print();
                    break;
                case 8:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 8);

        
    }
}
