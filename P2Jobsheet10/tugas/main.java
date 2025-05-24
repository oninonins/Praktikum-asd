package P2Jobsheet10.tugas;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueAntrian antrian = new QueueAntrian(10);
        int pilihan;
        //menu 
        do {
            System.out.println("Antrian persetujuan KRS");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Jumlah Antrian");
            System.out.println("6. Hapus Antrian");
            System.out.println("7. Panggil Antrian (2 Mahasiswa)");
            System.out.println("8. Lihat 2 Antrian Terdepan");
            System.out.println("9. Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("10. Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.tanpilkanSemua();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanAntrianPalingAkhir();
                    break;
                case 5:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.layaniMahasiswa();
                    break;
                case 7:
                    antrian.panggilAntrian();
                    break;
                case 8:
                    antrian.tampilkanDuaAntrianTerdepan();
                    break;
                case 9:
                    System.out.println("Jumlah Mahasiswa Sudah Proses KRS: " + antrian.getTotalDilayani());
                    break;
                case 10:
                    System.out.println("Jumlah Mahasiswa Belum Proses KRS: " + antrian.getBelumDilayani());
                    break;
                case 11:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);    
    }
}
