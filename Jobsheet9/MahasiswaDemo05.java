import java.util.Scanner;
public class MahasiswaDemo05 {

    public static void main(String[] args) {
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);
        Scanner input = new Scanner(System.in);
        int pilih;
        //menu 
        do {
            System.out.println("Menu:");    
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar tugas ");
            System.out.println("5. Melihat tugas terbawah");
            System.out.println("6. Melihat jumlah tugas yang sudah dikumpulkan");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); 
            switch (pilih) {
                case 1:
                    // Menambah tugas
                    System.out.print("Nama: ");
                    String nama = input.next();
                    System.out.print("NIM: ");
                    String nim = input.next();
                    System.out.print("Kelas: ");
                    String kelas = input.next();
                    Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    // Mengambil tugas
                    Mahasiswa05 dinilai = stack.pop();
                    if (dinilai != null) {
                       System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Maasukkan nilai (0-100) :  ");
                          int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("NIlai Tugas %s adalah  %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    // Cek tugas teratas
                    Mahasiswa05 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + lihat.nama);
                    }
                    break;
                case 4:
                    // Melihat daftar tugas
                    System.out.println("Daftar Tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    // Melihat tugas terbawah
                    Mahasiswa05 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh: " + terbawah.nama);
                    }
                    break;
                case 6:
                // Melihat jumlah tugas yang sudah dikumpulkan
                int jumlah = stack.jumlahTugas();
                System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 0 && pilih <= 6); 

    }
}
