package P2Jobsheet10;
public class AntrianLayanan {
   
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max) {
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
            return mhs;
        
    }


    //lihatakhirantrian
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terakhiran: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }


}  