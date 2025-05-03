public class StackSurat05 {
    Surat05[] stack;
    int top;
    int size;

    public StackSurat05(int size) {
        this.size = size;
        stack = new Surat05[size];
        top = -1;
    }

     //mengecek apakah stack sudah terisi penuh 
     public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    //mengecek apakah stack masih kosong
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat05 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin baru.");
        } else {
            top++;
            stack[top] = surat;
        }
    }

    public Surat05 pop() {
        if (!isEmpty()) {
            Surat05 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diambil.");
            return null;
        }
    }

    public Surat05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk dilihat.");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }

    public Surat05 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk dilihat.");
            return null;
        }
    }

    public int jumlahSurat() {
        return top + 1;
    }

     //cari surat izin berdasarkan nama mahasiswa
    public Surat05 cariSurat(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        System.out.println("Surat izin tidak ditemukan untuk mahasiswa: " + namaMahasiswa);
        return null;
    }
}
