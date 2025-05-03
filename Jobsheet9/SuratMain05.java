import java.util.Scanner;
public class SuratMain05 {
    public static void main(String[] args) {
        StackSurat05 stack = new StackSurat05(10 );
        Scanner input = new Scanner(System.in);
        int pilih;

        //menu 
        do {
            System.out.println("menu:");
            System.out.println("1. Terima surat izin");
            System.out.println("2. Proses surat izin");
            System.out.println("3. Lihat surat izin terakhir");
            System.out.println("4. cari surat izin ");
            System.out.println("5. keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); 
            switch (pilih) {
                case 1:
                    //memasukan data surat 
                    System.out.print("ID Surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin(S: sakit /I izin keperluan): ");
                    char jenisIzin = input.next().charAt(0);
                    System.out.print("Durasi izin(Hari): ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    //membuat objek surat
                    Surat05 surat = new Surat05(idSurat, nama, kelas, jenisIzin, durasi);

                    //memasukan surat ke dalam stack
                    stack.push(surat);
                    System.out.printf("Surat izin %s berhasil diterima\n", surat.namaMahasiswa);
                    break;
                case 2:
                    //memproses atau verivikasi surat izin
                    Surat05 verifikasi = stack.pop();
                    if (verifikasi != null) {
                        System.out.println("Memproses surat izin dari " + verifikasi.namaMahasiswa);
                        System.out.printf("Surat izin %s berhasil diproses\n", verifikasi.namaMahasiswa);
                    }
                    break;

                case 3:
                    //cek surat izin terakhir
                    Surat05 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir diterima dari: " + lihat.namaMahasiswa);
                    }
                    break;

                case 4: 
                    //cari surat izin berdasarkan nama mahasiswa
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = input.nextLine();
                    Surat05 hasil = stack.cariSurat(cari);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan: " + hasil.namaMahasiswa + " - " + hasil.kelas);
                    }

                    break;


                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        }while (pilih != 5); 


    }
}
