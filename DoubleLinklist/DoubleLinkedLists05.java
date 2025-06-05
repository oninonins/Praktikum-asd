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

    public void add(Mahasiswa05 data, int index) {
        if (isEmpty() || index == 0) {
            addFirst(data);
        } else {
            Node05 current = head;
            int i = 0;
            while (i < index - 1 && current != null) {
                current = current.next;
                i++;
            }
            if (current == null) {
                addLast(data);
            } else {
                Node05 newNode = new Node05(data);
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
            }
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
} 