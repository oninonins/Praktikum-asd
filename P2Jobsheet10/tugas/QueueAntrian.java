package P2Jobsheet10.tugas;
public class QueueAntrian {
int totalDilayani = 0;   
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max;

    public QueueAntrian(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;    
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;    
        } else {
            return false;
        }
    }
    //peek
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. ");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    //print
    public void tanpilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. ");
        } else {
            System.out.println("Daftar Antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
           for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print( (i + 1) + ": ");
                data[index].tampilkanData();
            }
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumDilayani() {
        return size;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //enqueue
    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa ");
            return;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil ditambahkan ke antrian");
        }
    }

    //dequeue
    public Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDilayani++;
            return mhs;
        
    }
    //memanggil antrian 1 kali panggil terdiri dari 2 mahasiswa
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa yang dipanggil: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < 2; i++) {
                if (isEmpty()) {
                    break;
                }
                Mahasiswa mhs = layaniMahasiswa();
                mhs.tampilkanData();
            }
        }
    }

    //menampilkan antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    // tampilkan 2 antrian terdepan
    public void tampilkanDuaAntrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Dua Antrian Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < 2; i++) {
                if (isEmpty()) {
                    break;
                }
                Mahasiswa mhs = data[front];
                mhs.tampilkanData();
                front = (front + 1) % max;
            }
        }
    }

    //menampilkan antrian paling akhir
    public void tampilkanAntrianPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian Paling Akhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            Mahasiswa mhs = data[rear];
            mhs.tampilkanData();
        }
    }


    

}  