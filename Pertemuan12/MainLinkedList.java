package Pertemuan12;

import java.util.Scanner;

public class MainLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList05 sll = new SingleLinkedList05();
          int pilihan ; 
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Setelah NIM Tertentu");
            System.out.println("4. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nimAwal = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String namaAwal = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelasAwal = input.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipkAwal = Double.parseDouble(input.nextLine());
                    input.nextLine();
                    sll.addFirst(new Mahasiswa05(nimAwal, namaAwal, kelasAwal, ipkAwal));
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    String nimAkhir = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String namaAkhir = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelasAkhir = input.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipkAkhir = Double.parseDouble(input.nextLine());
                    sll.addLast(new Mahasiswa05(nimAkhir, namaAkhir, kelasAkhir, ipkAkhir));
                    break;
                case 3:
                    System.out.print("Masukkan NIM setelah data mana: ");
                    String keyInsert = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nimInsert = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String namaInsert = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelasInsert = input.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipkInsert = Double.parseDouble(input.nextLine());
                    sll.insertAfter(keyInsert, new Mahasiswa05(nimInsert, namaInsert, kelasInsert, ipkInsert));
                    break;
                case 4:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
              
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;

            }
        }while (pilihan != 0 ); 

        
        System.out.println("\nData index 1:");
        sll.getData(1);

        
        System.out.println("Data mahasiswa an Bimon berada di index: " + sll.indexOf("Bimon"));

        
       
        sll.removeFirst();
        sll.removeLast();
        sll.print();


        sll.removeAt(0);
        sll.print();

       
    }
}
