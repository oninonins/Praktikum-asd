package Pertemuan12;

public class SingleLinkedList05 {
    NodeMahasiswa05 head;
    NodeMahasiswa05 tail;


    //isempty
    public boolean isEmpty() {
        return head == null;
    }

    //print 
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa05 tmp = head;
            System.out.println("isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }


    //addFirst
    public void addFirst(Mahasiswa05 input) {
        NodeMahasiswa05 ndInput = new NodeMahasiswa05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    //addLast
    public void addLast(Mahasiswa05 input) {
        NodeMahasiswa05 ndInput = new NodeMahasiswa05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    //insertAfter
    public void insertAfter(String key, Mahasiswa05 input) {
        NodeMahasiswa05 ndInput = new NodeMahasiswa05(input, null);
        NodeMahasiswa05 temp = head;
        do {
            if (temp.data.nim.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (temp == tail) {
                    tail = ndInput; 
                }
                return;
            }
            temp = temp.next;
        } while (temp != null);
    }

    //insert at 
    public void insertAt(int index, Mahasiswa05 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa05 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa05(input, null);
            if (temp.next.next == null) {
                tail = temp.next ; 
            }
        }

    }

    //mengakses data di index tertentu
    public void getData(int index) {
        NodeMahasiswa05 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public int indexOf(String key){
        NodeMahasiswa05 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            if (temp.data.nim.equals(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            return -1; 
        } else {
            return index; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa05 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong, tidak dapat dihapus");
        } else {
            NodeMahasiswa05 temp = head;
            while (temp != null) {
                if (temp.data.nim.equalsIgnoreCase(key) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nim.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp; // Update tail if we removed the last element
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa05 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
        
    }

}



