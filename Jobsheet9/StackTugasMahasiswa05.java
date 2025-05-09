public class StackTugasMahasiswa05 {
    
    Mahasiswa05[] stack;
    int top;
    int size;

    public StackTugasMahasiswa05(int size) {
        this.size = size;
        stack = new Mahasiswa05[size];
        top = -1;
    }

        //mengecek apakah tumpukan sudah terisi penuh 
        public boolean isFull() {
            if (top == size - 1) {
                return true;
            } else {
                return false;
            }
        }

        //mengecek apakah tumpukan masih kosong
        public boolean isEmpty() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        }

        //menambahkan data ke dalam tumpukan
        public void push(Mahasiswa05 mhs) {
            if (!isFull()) {
                top++;
                stack[top] = mhs;
            } else {
                System.out.println("Stack sudah penuh! Tidak bisa menambahkan tugas lagi. ");
            }
        }

        //mengambil data dari tumpukan
     public Mahasiswa05 pop() {
        if (!isEmpty()) {
             Mahasiswa05 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai. ");
            return null;
            }
        }
    
        //cek tugas yang berada di atas
        public Mahasiswa05 peek() {
            if (!isEmpty()) {
                return stack[top];
            } else {
                System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
                return null;
            }
        }
    
        public void print() {
           for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas );
           }
           System.out.println("");
        }

        //bottom
        public Mahasiswa05 bottom() {
            if (!isEmpty()) {
                return stack[0];
            } else {
                System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                return null;
            }
        }

        //hitung banyak tugas yang sudah dikumpulkan
        public int jumlahTugas() {
            return top + 1;
        }
        
        //konversi desimal ke biner 
        public String konversiDesimalKeBiner(int nilai){
            StackKonversi05 stack = new StackKonversi05();
            while (nilai > 0) {
                int sisa = nilai % 2;
                stack.push(sisa);
                nilai = nilai / 2;
                
            }
            String biner = new String();
            while (!stack.isEmpty()) {
                biner += stack.pop();
            }
            return biner;
        }
}
