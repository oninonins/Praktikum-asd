package DoubleLinklist;
public class Mahasiswa05 {
     String nim;
     String nama;
     String kelas;
     Double ipk;

    public Mahasiswa05(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
} 