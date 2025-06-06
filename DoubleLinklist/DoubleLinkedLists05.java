package DoubleLinklist;

public class DoubleLinkedLists05 {
    Node05 head;
    Node05 tail;

    
    public DoubleLinkedLists05() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //size() untuk menghitung jumlah node dalam linked list
    public int size() {
        int ukuran = 0;
        Node05 current = head;
        while (current != null) {
            ukuran++;
            current = current.next;
        }
        return ukuran;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;    
            head = newNode;
        }
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
            return;
        }
        Node05 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public Node05 search(String nim) {
        Node05 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa05 data) {
        Node05 current = head;

        //cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        //buat node baru
        Node05 newNode = new Node05(data);

        // jika current adalah tail, cukup tambahkan di akhir 
        if (current == tail) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan setelah " + keyNim);
        
    }


    //removefirst
    public void removeFirst(Mahasiswa05 data) {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong, tidak bisa dihapus.");
            return;
        }
         Mahasiswa05 deletedData = head.data;
        if (head == tail) {
            head = tail = null; // Jika hanya ada satu node
        } else {
            head = head.next; // Pindahkan head ke node berikutnya
            head.prev = null; // Set prev dari head baru ke null
            
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }

    //removeLast
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa05 deletedData = tail.data;
        if (head == tail) {
            head = tail = null; // Jika hanya ada satu node
        } else {
            tail = tail.prev; // Pindahkan tail ke node sebelumnya
            tail.next = null; // Set next dari tail baru ke null
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }

    //add() untuk menambahkan data di note tertentu 
    public void add(Mahasiswa05 data, int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
    
        Node05 current = head;
        int i = 0;
        while (i < index - 1 && current != null) {
            current = current.next;
            i++;
        }
    
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
            return;
        }
    
        Node05 newNode = new Node05(data);
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode; // Update tail jika node baru adalah node terakhir
        }
    }

    //removeAfter() untuk menghapus data setelah node tertentu
    public void removeAfter(String keyNim) {
        Node05 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
    
        if (current == null || current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim);
            return;
        }
    
        Node05 deletedNode = current.next;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        deletedNode.data.tampil();
    
        current.next = deletedNode.next;
        if (deletedNode.next != null) {
            deletedNode.next.prev = current;
        } else {
            tail = current; // Update tail jika node yang dihapus adalah tail
        }
    }

    public void remove(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node05 current = head;
        int i = 0;
        while (i < index && current != null) {
            current = current.next;
            i++;
        }
    
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
            return;
        }
    
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        current.data.tampil();
    
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev; // Update tail jika node terakhir dihapus
        }
    }

    public Mahasiswa05 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        return head.data;
    }
    
    public Mahasiswa05 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        return tail.data;
    }
    
    public Mahasiswa05 getIndex(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return null;
        }
    
        Node05 current = head;
        int i = 0;
        while (i < index && current != null) {
            current = current.next;
            i++;
        }
    
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
            return null;
        }
        return current.data;
    }
} 