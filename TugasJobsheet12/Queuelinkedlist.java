package TugasJobsheet12;

public class Queuelinkedlist {

    Node head;
    Node tail;
    int size;


    //is empty
    public boolean isEmpty() {
        return head == null;
    }


    // Menambahkan antrian (enqueue)
    public void enqueue(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


    // Menghapus antrian (dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa berikut dipanggil :");
            head.data.tampilInformasi();
            head = head.next;
            if (head == null) tail = null;
            size--;
        }
    }

    // Melihat antrian terdepan (peek)
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan :");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    // Melihat antrian terakhir
    public void peekLast() {
         if (!isEmpty()) {
            System.out.println("Antrian terakhir :");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong!");
        };
    }

    // Menampilkan jumlah antrian
    public int size() {
        return size;
    }

    //mengosongkan antrian
    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    //print
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            Node current = head;
            System.out.println("Daftar Antrian Mahasiswa:");
            while (current != null) {
                current.data.tampilInformasi();
                current = current.next;
            }
        }
    }
}