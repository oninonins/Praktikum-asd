package Pertemuan12;

public class Mahasiswa05 {

    String nim;
    String nama;
    String kelas;
    double ipk;
    
    Mahasiswa05();
    
    Mahasiswa05(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {

        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }

}