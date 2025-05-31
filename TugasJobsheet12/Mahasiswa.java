package TugasJobsheet12;

public class Mahasiswa {

    String nim;
    String nama;
    String jurusan;
    String izin;
    
    Mahasiswa();
    
    Mahasiswa(String nm, String name, String jurusan, String keperluan) {
        this.nim = nm;
        this.nama = name;
        this.jurusan = jurusan;
        this.izin = keperluan;
    }

    public void tampilInformasi() {

        System.out.println(nama + "\t" + nim + "\t" + jurusan + "\t" + izin);
    }

}